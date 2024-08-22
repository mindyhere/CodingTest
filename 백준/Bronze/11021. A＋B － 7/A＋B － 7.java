import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // 테스트 케이스 개수 T를 입력받아 저장
        int t = sc.nextInt();
    
        // 테스트 케이스 번호는 1번부터 시작
        for (int i=1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
        
            System.out.println("Case #" + i + ": " + (a+b));
        }
        sc.close();
    }
}    