package d220128;

import java.util.Scanner;

public class Main93 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] arr = new int[23];
		for(int i = 0; i < count; i++) {
			int n = sc.nextInt();
			arr[n-1]++;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

