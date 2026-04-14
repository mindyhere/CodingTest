class Solution {
    public int solution(int[] numbers) {
        int[] arr = new int[10];
        
        for (int i : numbers) {
            arr[i]++;
        }
        
        int answer = 0;
        for (int i=0; i<=9 ; i++) {
            if (arr[i] == 1) continue;        
            answer += i ;
        }
        
        return answer;
    }
}