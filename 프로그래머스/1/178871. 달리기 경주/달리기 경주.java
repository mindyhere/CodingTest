import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String calling : callings) {
            int currIdx = map.get(calling);
            String currPlayer = calling;
            
            // 추월당할 바로 앞 선수의 등수와 이름
            int frontIdx = currIdx - 1;
            String frontPlayer = players[frontIdx];
            
            // players 배열에서 두 선수의 위치를 교환
            players[frontIdx] = currPlayer;
            players[currIdx] = frontPlayer;
            
            // map에서도 두 선수의 등수 정보를 업데이트
            map.put(currPlayer, frontIdx);
            map.put(frontPlayer, currIdx);
        }
        
        return players;
    }
}