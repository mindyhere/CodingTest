class Solution {
    public int solution(int n, int m, int[] section) {
        int p = 0;  // 페인트가 칠해진 마지막 구역 번호
        int count = 0; // 페인트 칠한 횟수
        
        for (int num : section) {
            if (num > p) {
                p = num + m - 1;
                count++;
            }
        }
        
        return count;
    }
}