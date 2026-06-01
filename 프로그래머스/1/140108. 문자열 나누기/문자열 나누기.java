class Solution {
    public int solution(String s) {
        int answer = 0;
        int countX = 0;
        int countOthers = 0;
        
        char x = ' ';
        boolean isNewBlock = true;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (isNewBlock) {
                x = c;
                isNewBlock = false;
            }
            
            // x와 같은지 다른지 카운트
            if (c == x) countX++;
            else countOthers++;

            
            // x의 개수와 다른 글자의 개수가 같아질 때
            if (countX == countOthers) {
                answer++;       // 문자열 조각 개수 증가
                countX = 0;     // 카운트 초기화
                countOthers = 0;
                isNewBlock = true; // 다음 글자는 새로운 x
            }
        }
    
        // 루프가 끝났는데 카운트가 남아있는 경우
        if (!isNewBlock) answer++;

        return answer;
    }
}