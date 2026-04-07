class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (angle <= 90) return angle == 90 ? 2 : 1;
        else if (angle < 180) return 3;
        else return 4;
    }
}