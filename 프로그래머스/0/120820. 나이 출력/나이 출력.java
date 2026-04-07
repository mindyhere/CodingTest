class Solution {
    public int solution(int age) {
        // 태어난 년도에 1살
        // 태어난 년도 = 기준년도(2022) - (연나이-1)
        int answer = 0;
        int stdYr = 2022;
        answer = 2022 - (age - 1) ;        
        return answer;
    }
}