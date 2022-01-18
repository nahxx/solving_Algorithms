package d220118;

import java.util.Scanner;

public class Main46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		long sum = a + b + c;
		System.out.println(sum);
		System.out.printf("%.1f", (double)sum / 3);
	}

}
