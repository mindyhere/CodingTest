import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> stack = new ArrayList<>();
        
        for (int i:ingredient) {
            stack.add(i);
            
            int size = stack.size();
            if (size < 4) continue;
            
            if (stack.get(size - 4) == 1
               && stack.get(size - 3) == 2
               && stack.get(size - 2) == 3
               && stack.get(size - 1) == 1) {
                answer++;
                
                for (int j=0; j<4; j++) {
                    stack.remove(stack.size() - 1);
                }
            }
        }
        
        return answer;
    }
}