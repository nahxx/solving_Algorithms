package d220127;

import java.util.Scanner;

public class Main87 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (sum >= n)
				break;
			sum += i;
		}
		System.out.println(sum);
	}

}
