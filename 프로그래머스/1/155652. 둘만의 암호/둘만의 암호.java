import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        // skip을 제외한 알파벳을 담을 새로운 리스트 생성
        List<Character> alphabet = new ArrayList<>();
        
        // a-z까지 skip을 제외한 나머지 문자 -> 리스트에 추가
        for (char c = 'a'; c<='z'; c++) {
            if (!skip.contains(String.valueOf(c))) alphabet.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        
        // s의 문자 치환(반복)
        for (int i=0; i<s.length(); i++) {
            char curr = s.charAt(i);
            
            // 현재 문자를 alphabet리스트 기준, 인덱스 찾기
            int currIdx = alphabet.indexOf(curr);  
            // 인덱스 이동(z -> a로 순환)
            int newIdx = (currIdx + index) % alphabet.size();
            
            // 변환한 인덱스 기준으로 문자 붙이기
            sb.append(alphabet.get(newIdx));
        }
        
        return sb.toString(); // 문자열로 반환
    }
}