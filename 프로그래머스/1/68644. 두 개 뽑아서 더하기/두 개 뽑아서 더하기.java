import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 중복을 허용X & 정렬해주는 트리셋 선언
        Set<Integer> set = new TreeSet<>();
        
        // 반복문을 돌면서 두수를 뽑아서 set에 추가
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] +numbers[j]);
            }
        }
        
        // int 배열로 반환
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}