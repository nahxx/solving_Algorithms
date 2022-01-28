package d220128;

import java.util.Scanner;

public class Main94 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] arr = new int[count];
		for(int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = count-1; i >= 0; i--)
			System.out.print(arr[i] + " ");
	}

}
