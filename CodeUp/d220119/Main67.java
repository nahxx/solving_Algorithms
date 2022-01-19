package d220119;

import java.util.Scanner;

public class Main67 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("minus");
			if (n % 2 == 0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
		else {
			System.out.println("plus");
			if (n % 2 == 0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
	}

}
