class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        // food[0] 은 물 -> 인덱스 1부터 끝까지 반복처리
        for (int i=1; i<food.length; i++) {
            int count = food[i] / 2; // 한 선수가 먹을 양
            
            for (int j=0; j<count; j++) sb.append(i);
        }

        String leftSide = sb.toString();
        
        return leftSide + "0" +sb.reverse().toString();
    }
}