class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 체육복을 가진 사람 번호를 저장하기 위한 배열 선언
        int[] clothes = new int[n+1];
        
        for (int i=1; i<=n; i++) {
            clothes[i] = 1; // 모두 1개의 체육복이 있다고 가정
        }
        
        // 도난 당한 사람 차감
        for (int l : lost) clothes[l]--;
        
        // 여벌이 있는 사람은 증가
        for (int r: reserve) clothes[r]++;
        
        // 도난 당한 사람에게 빌려주기
        for (int i=1; i<=n; i++) {
            if (clothes[i] == 0) {
                if (i-1 >= 1 && clothes[i-1] == 2) { // 앞번호 학생 먼저 확인
                    clothes[i-1]--;
                    clothes[i]++;
                } else if (i+1 <= n && clothes[i+1] == 2) { // 뒷번호 학생에게 확인
                    clothes[i+1]--;
                    clothes[i]++;
                }
            }
        }
        
        // 체육복이 1개 이상인 학생 수 세기
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (clothes[i] >= 1) answer++;
        }
        
        return answer;
    }
}