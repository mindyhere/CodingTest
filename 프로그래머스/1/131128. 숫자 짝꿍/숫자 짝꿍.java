class Solution {
    public String solution(String X, String Y) {
        // 숫자 확인을 위한 배열 선언
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        // X안에 있는 숫자 개수 카운트
        for (int i=0; i<X.length(); i++) {
            countX[X.charAt(i) - '0']++;
        }
        
        for (int i=0; i<Y.length(); i++) {
            countY[Y.charAt(i) - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        // 가장 큰 수를 만들어야하기 때문에 배열의 끝 인덱스(9->0)부터 순회
        for (int i=9; i>=0; i--) {
            // 공통으로 존재하는 수만큼 카운트
            int commonCnt = Math.min(countX[i], countY[i]);
            // 이어붙이기
            sb.append(String.valueOf(i).repeat(commonCnt));
        }
        
        String answer = sb.toString();
        
        if (answer.length() == 0) return "-1";
        if (answer.startsWith("0")) return "0";
        
        return answer;
    }
}