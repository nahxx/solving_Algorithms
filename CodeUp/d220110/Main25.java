package d220110;

import java.util.Scanner;

public class Main25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] arr = new String[str.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.substring(i, i+1);
			System.out.print("[" + arr[i]);
			for (int j = arr.length-1; i < j; j--) {
				System.out.print("0");
			}
			System.out.print("]\n");
		}
	}

}
