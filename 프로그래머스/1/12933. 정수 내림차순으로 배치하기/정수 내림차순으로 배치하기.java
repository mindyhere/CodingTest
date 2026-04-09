import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        // 숫자를 문자열로 변환하고, 하나씩 잘라서 arr에 담는다
        String[] arr = String.valueOf(n).split("");
        
        // 내림차순 정렬 reverseOrder()
        Arrays.sort(arr, Collections.reverseOrder());
        
        // 다시 하나의 문자열로
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        
        return Long.parseLong(sb.toString());
    }
}