import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 각 찍기 패턴 배열정의
        int[][] patterns = {
            {1,2,3,4,5},    // 수포자1
            {2,1,2,3,2,4,2,5},  // 수포자2
            {3,3,1,1,2,2,4,4,5,5}   // 수포자3
        };
        // 세사람의 점수를 담을 배열
        int[] scores = new int[3];
        
        for (int i=0; i<answers.length; i++) {
            // 사람 순서대로 반복
            for (int j=0; j<patterns.length; j++) {
                // 한 문제씩 각 수포자의 답과 비교해서 채점
                int a = patterns[j][i % patterns[j].length];
                if (answers[i] == a) scores[j]++;
            }
        }
        
        // 최고점 계산
        int max = Math.max(scores[0], (Math.max(scores[1], scores[2])));
        
        // 사람
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<scores.length; i++) {
            // 최고점 동점자, 인덱스 오름차순으로 찾아서 list에 추가
            if (scores[i] == max) list.add(i+1); // 수포자 번호=인덱스+1;
        }
        
        // int 배열로 변환
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        } 
        
        return answer;
    }
}