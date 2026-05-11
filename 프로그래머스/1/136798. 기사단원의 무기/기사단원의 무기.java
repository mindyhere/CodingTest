class Solution {
    public int solution(int number, int limit, int power) {
        // 필요한 철의 무게(합계)
        int answer=0;

        for (int n=1; n<=number; n++) {
            int count=0; // 약수 개수
            
            // 1. 약수 개수 구하기
            for (int i=1; i*i <=n; i++) {
                if (n%i == 0) {
                    if (i*i == n) count++; // 제곱근인 경우(+1)
                    else count += 2;    // 쌍으로 카운트(+2)
                }
            }
            
            // 2. 공격력 제한 체크 -> 제한수치 이상이면 power, 아니면 count로 더함
            answer += count > limit ? power : count;
        }
        
        return answer;
    }
}