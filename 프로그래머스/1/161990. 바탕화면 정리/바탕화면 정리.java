class Solution {
    public int[] solution(String[] wallpaper) {
        // 최솟값= 가장 큰 값, 최댓값=가장 작은 값으로 초기화
        int lux = 51;
        int luy = 51;
        int rdx = -1;
        int rdy = -1;
        
        // 파일이 존재하는 2차원 영역
        int rowLength = wallpaper.length;
        int colLength = wallpaper[0].length();
        
        // 2차원 격자 전체 순회 (i:세로, j:가로)
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                
                // 파일을 발견하면 경계선 업데이트
                if (wallpaper[i].charAt(j) == '#') {
                    lux = Math.min(lux, i); // 가장 위쪽 행 갱신
                    luy = Math.min(luy, j); // 가장 왼쪽 열 갱신
                    rdx = Math.max(rdx, i); // 가장 아래쪽 행 갱신
                    rdy = Math.max(rdy, j); // 가장 오른쪽 열 갱신
                }
            }
        }
        
        return new int[] {lux, luy, rdx + 1, rdy + 1};
    }
}