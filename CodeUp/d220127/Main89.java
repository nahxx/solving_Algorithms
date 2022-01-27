package d220127;

import java.util.Scanner;

public class Main89 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int result = a;
		int count = 1;
		while(count < n) {
			result += d;
			count++;
		}
		System.out.println(result);
	}

}
