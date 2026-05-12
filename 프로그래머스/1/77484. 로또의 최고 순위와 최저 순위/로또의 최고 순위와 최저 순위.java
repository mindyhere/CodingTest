import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> winSet = new HashSet<>();
        for (int n : win_nums) winSet.add(n);
        
        int hit = 0;
        int zeroCnt = 0;
        for (int num : lottos) {
            if (num == 0) {
                zeroCnt++;
            } else if (winSet.contains(num)) {
                hit++;
            }
        }
        
        int maxRank = Math.min(7 - (hit+zeroCnt), 6);
        int minRank = Math.min(7 - hit, 6);
        int[] answer = new int[] {maxRank, minRank};
        
        return answer;
    }
}