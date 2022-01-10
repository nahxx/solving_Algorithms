package d220110;

import java.util.Scanner;

public class Main26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(":");
		System.out.printf("%d", Integer.parseInt(arr[1]));
	}

}
