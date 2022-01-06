package d220106;

import java.util.Scanner;

public class Main19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		String[] args1 = date.split("\\.");
		int [] arr = new int[3];
		
		for(int i = 0; i < args1.length; i++) {
			arr[i] = Integer.parseInt(args1[i]);
		}
		System.out.printf("%04d.%02d.%02d", arr[0], arr[1], arr[2]);	
	}
}
