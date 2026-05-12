class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;

        // 서로 다른 숫자 3개(nums)
        for (int i=0; i<len-2; i++) {
            for (int j=i+1; j<len-1; j++) {
                for (int k=j+1; k<len; k++) {
                    // 세 수의 합
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    // 소수 판별
                    if (isPrime(sum)) answer++;
                }
            }
        }
        
        return answer;
    }
    
    // 소수 판별
    private boolean isPrime(int n) {
        // 제곱근까지 나누어떨어지는 수가 있는지 확인
        if (n < 2) return false;
        
        for (int i=2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}