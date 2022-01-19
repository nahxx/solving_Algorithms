package d220119;

import java.util.Scanner;

public class Main58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(((a == b) & (b == 0)) ? 1 : 0);
	}
}
