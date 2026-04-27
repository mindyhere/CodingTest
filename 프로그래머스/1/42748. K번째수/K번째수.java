import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        
        for (int i=0; i<len; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int target = commands[i][2];
            
            // 부분배열 생성 - 시작인덱스 포함, 끝인덱스 미포함
            int[] sub = Arrays.copyOfRange(array, start-1, end);
            
            // 정렬
            Arrays.sort(sub);
            
            // 타겟값 저장
            answer[i] = sub[target-1];
        }
        
        return answer;
    }
}