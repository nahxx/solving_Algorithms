package Step4_while;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int N2 = N;
		while (true) {
			int ten = N / 10; // 10의 자리
			int one = N % 10; // 1의 자리
			N = (one * 10) + ((ten + one) % 10);
			count++;
			if (N == N2)
				break;
		}
		System.out.println(count);
	}
}
