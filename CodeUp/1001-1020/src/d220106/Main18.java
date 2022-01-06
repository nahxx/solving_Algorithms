package d220106;

import java.util.Scanner;

public class Main18 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] args1 = str.split(":");
		String h = args1[0];
		String m = args1[1];
		System.out.printf("%s:%s", h, m);
	}
}
