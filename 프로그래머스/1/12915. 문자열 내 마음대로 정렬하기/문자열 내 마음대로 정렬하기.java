import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>();
        // 각 문자열 맨 앞에 인덱스 n의 문자 붙여서 list 생성
        for (String str : strings) {
            list.add(str.charAt(n) + str);
        }
        
        // 오름차순 정렬
        Collections.sort(list);
        
        // 원래 strings 배열과 같은 크기의 answer 생성
        int len = list.size();        
        String[] answer = new String[len];  

        // 각 문자 되돌리기(맨 앞에 임의로 붙인 문자 제거)
        for (int i=0 ; i < len ; i++) {
            answer[i] = list.get(i).substring(1);
        }
        
        return answer;
    }
}