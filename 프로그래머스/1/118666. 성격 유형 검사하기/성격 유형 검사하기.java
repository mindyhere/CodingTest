import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scoreMap = new HashMap<>(Map.of(
            'R', 0, 'T', 0,
            'C', 0, 'F', 0,
            'J', 0, 'M', 0,
            'A', 0, 'N', 0
        ));
        
        for (int i=0; i<survey.length; i++) {
            String q = survey[i];
            int choice = choices[i];
            if (choice < 4) {
                char target = q.charAt(0);
                int score = 4 - choice; // 1->3점, 2->2점, 3->1점으로 보정
                scoreMap.put(target, scoreMap.get(target) + score);
            } else if (choice > 4) {
                char target = q.charAt(1);
                int score = choice - 4; // 5->1점, 6->2점, 7->3점으로 보정
                scoreMap.put(target, scoreMap.get(target) + score);
            }
        }
        
        // 3. 지표별로 점수를 비교하여 최종 성격 유형 조합
        StringBuilder sb = new StringBuilder();
        
        if (scoreMap.get('R') >= scoreMap.get('T')) sb.append('R');
        else sb.append('T');
        
        if (scoreMap.get('C') >= scoreMap.get('F')) sb.append('C');
        else sb.append('F');
        
        if (scoreMap.get('J') >= scoreMap.get('M')) sb.append('J');
        else sb.append('M');
        
        if (scoreMap.get('A') >= scoreMap.get('N')) sb.append('A');
        else sb.append('N');
        
        return sb.toString();
    }
}