package d220110;

import java.util.Scanner;

public class Main27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] arr = str.split("\\.");
		Integer [] arr1 = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = Integer.parseInt(arr[i]);
		}
		System.out.printf("%02d-%02d-%04d", arr1[2], arr1[1], arr1[0]);
	}

}