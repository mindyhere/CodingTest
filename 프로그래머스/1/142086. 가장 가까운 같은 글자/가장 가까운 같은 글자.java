import java.util.*;

class Solution {
    public int[] solution(String s) {
        // s 와 같은 크기로 초기화
        int[] answer = new int[s.length()];
        
        // 문자의 최신인덱스를 저장할 맵(키:값 -> 문자:인덱스)
        Map<Character, Integer> map = new HashMap<>();
        
        // 반복문을 돌며 처리
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            // 맵에 키(확인할 문자 c)에 해당하는 값이 null이면 최초 등장 -> -1
            if (map.get(c) == null) {
                answer[i] = -1;
            } else {
            // 해당하는 값이 있으면 현재 인덱스 기준, 가장 가까운 위치와 거리 계산
                answer[i] = i- map.get(c);
            }    
            
            // 맵에 확인한 문자 인덱스 갱신
            map.put(c, i);
        }

        return answer;
    }
}