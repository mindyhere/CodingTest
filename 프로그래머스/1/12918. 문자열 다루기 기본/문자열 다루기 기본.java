class Solution {
    public boolean solution(String s) {
        // 문자열 길이 확인
        if (s.length() != 4 && s.length() !=6) {
            return false;
        }
        
        // 문자열 구성 확인
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') return false;
        }
        
        return true;
    }
}