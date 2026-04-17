import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // 배열로 변환
        char[] arr = s.toCharArray();
        
        // 정렬(기본 오름차순)
        Arrays.sort(arr);
        
        // 스트링 변환
        StringBuilder sb = new StringBuilder(new String(arr));
        
        // 내림차순으로 뒤집어서 반환
        return sb.reverse().toString();
    }
}