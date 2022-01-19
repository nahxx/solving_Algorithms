package d220119;

import java.util.Scanner;

public class Main56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		/*
		if (((a & b) == 0) && (a != b)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		*/
		System.out.println((((a & b) == 0) && (a != b)) ? 1 : 0);
	}

}
