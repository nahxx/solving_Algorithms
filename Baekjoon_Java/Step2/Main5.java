package Step2;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		if (M >= 0 && M >= 45) {
			M -= 45;
			System.out.print(H + " " + M);
		}
		else if (M >= 0 && M < 45) {
			M = 60 + (M - 45);
			if (H == 0)
				H = 23;
			else
				H -= 1;
			System.out.print(H + " " + M);
		}
	}
}
