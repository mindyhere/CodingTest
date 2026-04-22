class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = 0;
        int maxH = 0;
        
        // sizes 의 각 원소의 [가로, 세로] -> [큰수, 작은수] 가 되게
        // 가로의 최댓값, 세로의 최댓값 갱신
        for (int[] size : sizes) {
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);
            
            maxW = Math.max(maxW, w);
            maxH = Math.max(maxH, h);
        }
        
        // 너비 리턴
        return maxW * maxH;
    }
}