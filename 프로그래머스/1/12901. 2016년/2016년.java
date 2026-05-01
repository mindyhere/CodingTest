import java.time.*;

class Solution {
    public String solution(int a, int b) {
        
    return LocalDate.of(2016, a, b).getDayOfWeek().name().substring(0, 3);
    }
}