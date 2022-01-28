package d220128;

import java.util.Scanner;

public class Main99 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[10][10];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int x = 1;
		int y = 1;
		while(true) {
			if(x > 9 || y > 9)
				break;
			if(arr[x][y] == 0) {
				arr[x][y] = 9;
			} else if(arr[x][y] == 2) {
				arr[x][y] = 9;
				break;
			} else if(arr[x][y+1] == 1) {
				if(arr[x+1][y] == 1)
					break;
				else {
					x++;
				}
			} else if (arr[x][y+1] != 1) {
				y++;
			}
			if(arr[x][y] == 2) {
				arr[x][y] = 9;
				break;
			}
			arr[x][y] = 9;
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
