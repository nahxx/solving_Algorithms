package math;

import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        //(3) 부분
        System.out.println(a * (b % 10));
        //(4) 부분
        System.out.println(a * (b % 100 / 10));
        //(5) 부분
        System.out.println(a * (b / 100));
        //(6)부분
        System.out.println(a * b);
	}

}
