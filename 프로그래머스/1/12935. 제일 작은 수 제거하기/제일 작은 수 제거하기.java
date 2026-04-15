import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        // 1. 길이가 1인 배열일 때 우선 처리
        if (arr.length <= 1) return new int[]{-1};

        // 2. 배열에서 최솟값 찾기
        int min = Arrays.stream(arr).min().getAsInt();

        // 3. min과 같지 않은 요소만 필터링 -> 배열로 변환
        return Arrays.stream(arr)
                     .filter(i -> i != min)
                     .toArray();
    }
}