class Solution {
    public int solution(String[] babbling) {
        String[] pieces = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (String s : babbling) {
            boolean can = true; // 발음이 가능한지 여부 flag
            for (String p : pieces) {
                // 같은 발음이 연속되는 단어 -> 불가 -> 다음 반복으로 넘어감
                if (s.contains(p+p)) {
                    can = false;
                    break;
                }
            }
            
            if (can) {
                for (String p : pieces) {
                    s = s.replace(p, " ");  // 발음할 수 있는 소리 공백으로 치환
                }
                
                if (s.trim().length() == 0) answer++;
            }
        }
        
        return answer;
    }
}