package math;

import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        //(3) 何盒
        System.out.println(a * (b % 10));
        //(4) 何盒
        System.out.println(a * (b % 100 / 10));
        //(5) 何盒
        System.out.println(a * (b / 100));
        //(6)何盒
        System.out.println(a * b);
	}

}
