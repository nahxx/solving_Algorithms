package d220106;

import java.util.Scanner;

public class Main20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String idn = sc.nextLine();
		String[] arr = idn.split("-");
		System.out.println(arr[0] + arr[1]);
	}
}
