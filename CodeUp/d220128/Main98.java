package d220128;

import java.util.Scanner;

public class Main98 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt(); // ������ ����
		int h = sc.nextInt(); // ������ ����
		int[][] arr = new int[w+1][h+1];
		int count = sc.nextInt(); // ������ ����
		for (int i = 0; i < count; i++) {
			int n = sc.nextInt(); // ������ ����
			int d = sc.nextInt(); // ������ ����(0���� 1����)
			int x = sc.nextInt()-1; // ��������� x��ǥ
			int y = sc.nextInt()-1; // ��������� y��ǥ
			
			if (d == 0) { // ���� ������ ���ζ��
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
