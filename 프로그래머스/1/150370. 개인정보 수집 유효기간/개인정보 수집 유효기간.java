import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        
        // today -> day단위 정수 변환
        int todayDays = convertToDays(today);
        
        // terms 를 termsMap으로 재구성 {"A":6, "B":12, ...}
        Map<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] split = term.split(" ");
            termsMap.put(split[0], Integer.parseInt(split[1]));
        }
        
        // privacies -> 수집일자 순회 & 파기 여부 판별
        for (int i=0; i<privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            String collected = split[0]; // 개인정보 수집일자
            String termType = split[1]; // 정책 유형
            
            // 수집일자 -> 정수변환
            int collectedDays = convertToDays(collected);
            // 약관 정책에 의한 만료일 계산 -> 정수변환
            int expireDays = collectedDays + termsMap.get(termType)*28;
            
            // 오늘날짜 >= 만료일 -> 파기대상
            if (todayDays >= expireDays) {
                result.add(i+1); // 개인정보 인덱스 1부터 시작
            }
        }
        
        // 리턴타입: List -> int배열 변환
        int[] answer = new int[result.size()];
        for (int i=0; i<result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
    
    private int convertToDays(String date) {
        // yyyy.mm.dd
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        
        return (year*12*28) + (month*28) + day; //  제한사항에서 한달은 28로 가정
    }
}