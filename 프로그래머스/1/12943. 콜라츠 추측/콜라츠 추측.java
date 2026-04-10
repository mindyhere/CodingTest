class Solution {
    public int solution(int num) {
        if (num == 1) return 0;
        
        long n = (long) num; // 오버플로 방지를 위해 형변환
        int answer = 0;
        
        while (n != 1 && answer < 500) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
            answer++;
        }
     
        return answer < 500 ? answer : -1;
    }
}