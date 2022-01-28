package d220128;

import java.util.Scanner;

public class Main98 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt(); // 격자판 가로
		int h = sc.nextInt(); // 격자판 세로
		int[][] arr = new int[w+1][h+1];
		int count = sc.nextInt(); // 막대의 개수
		for (int i = 0; i < count; i++) {
			int n = sc.nextInt(); // 막대의 길이
			int d = sc.nextInt(); // 막대의 방향(0가로 1세로)
			int x = sc.nextInt()-1; // 막대시작점 x좌표
			int y = sc.nextInt()-1; // 막대시작점 y좌표
			
			if (d == 0) { // 막대 방향이 가로라면
				for (int j = 0; j < n; j++) {
					arr[x][y+j] = 1;
				}
			}
			else {
				for (int j = 0; j < n; j++) {
					arr[x+j][y] = 1;
				}
			}
		}
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
