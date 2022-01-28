package d220128;

import java.util.Scanner;

public class Main95 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] arr = new int[23];
		for (int i = 0; i < count; i++) {
			int n = sc.nextInt();
			arr[n-1] = 1;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				System.out.println(i+1);;
				break;
			}
		}
	}

}
