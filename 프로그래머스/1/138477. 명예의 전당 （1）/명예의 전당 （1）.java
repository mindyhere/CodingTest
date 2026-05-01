import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        // 점수를 담을 리스트 생성
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<score.length; i++) {
            // 점수 리스트에 넣기
            list.add(score[i]);
                
            // 내림차순 정렬
            Collections.sort(list, Collections.reverseOrder());
        
            // 리스트에 담긴 점수 개수 체크: k보다 크면 마지막(제일 작은 점수) 요소 제거
            if (list.size() > k) list.remove(k);
            
            // 현재 정답 배열 구성
            answer[i] = list.get(list.size()-1);
        }
        return answer;
    }
}