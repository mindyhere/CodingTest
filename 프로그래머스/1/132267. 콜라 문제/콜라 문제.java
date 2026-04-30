class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            int c = n/a; // 교환할 수 있는 횟수
            answer += c*b; // 새로 얻은 병 개수
            n = n%a +c*b; // 나머지 + 새로 얻은 개수
        }
        return answer;
    }
}