package d220127;

import java.util.Scanner;

public class Main90 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long r = sc.nextInt();
		long n = sc.nextInt();
		long result = a;
		for (int i = 2; i <= n; i++) {
			result *= r;
		}
		System.out.println(result);
	}

}
