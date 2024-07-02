import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n;
		
		if (x  > 0 && y > 0) {
			n = 1;
		} else if (x <0  && y > 0) {
			n = 2;
		} else if (x <0  && y < 0) {
			n = 3;
		} else {
			n = 4;
		}
		System.out.println(n);
	}
}