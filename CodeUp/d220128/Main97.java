package d220128;

import java.util.Scanner;

public class Main97 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[19][19];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			for (int j = 0; j < arr.length; j++) {
				if(arr[x][j] == 0)
					arr[x][j] = 1;
				else
					arr[x][j] = 0;
			}
			for (int k = 0; k < arr.length; k++) {
				if(arr[k][y] == 0)
					arr[k][y] = 1;
				else
					arr[k][y] = 0;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
