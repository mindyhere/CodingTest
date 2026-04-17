class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        while (left <= right) {
            if (left == 1) {
                answer -= 1;
                left++;
                continue;
            }
            
            int cnt = 2;
            for (int i=2; i <= left /2 ; i++) {
                if (left % i == 0) cnt++;
            }
            
            answer += (cnt % 2 == 0) ? left : (-left);
            left++;
        }
        
        return answer;
    }
}