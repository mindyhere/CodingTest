import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList();
        
        // 1. 나누어 떨어지는 값 찾기
        for (int i=0; i<arr.length; i++) {
            if ((arr[i] % divisor) == 0) {
                list.add(arr[i]);
            }
        }
        
        // 2. 찾은 하나도 없는 경우
        if (list.size() == 0) return new int[]{-1};
        
        // 3. 오름차순 정렬
        Collections.sort(list);
        
        // 4. 배열로 변환
        int[] answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);    
        }
        
        return answer;
    }
}