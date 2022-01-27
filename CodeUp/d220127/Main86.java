package d220127;

import java.util.Scanner;

public class Main86 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		int b = sc.nextInt();
		double result = (w * h * b) / 8 / 1024 / 1024;
		System.out.printf("%.2f MB", result);
	}

}
