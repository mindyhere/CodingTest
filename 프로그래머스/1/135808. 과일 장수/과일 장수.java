import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 사과 점수 정렬(오름차순)
        Arrays.sort(score);

        // 2. 내림차순으로 반복하기 위해 배열의 뒤에서부터 m개씩 건너뛰며 반복
        // i -> 가장 낮은 점수가 있는 위치
        for (int i = score.length - m; i >= 0; i -= m) {
            answer += score[i]*m;
        }
        
        return answer;
    }
}