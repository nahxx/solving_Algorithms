package Step2;

import java.util.Scanner;

class Quadrant {
	int x, y;
	
	public void point(int x, int y) {
		
		this.x = x;
		this.y = y;
		// 1��и� : x��� y���
		if ((x > 0 && x <= 1000) && (y > 0 && y <= 1000))
			System.out.println("1");
		// 2��и� : x���� y���
		else if ((x >= -1000 && x < 0) && (y > 0 && y <= 1000))
			System.out.println("2");
		// 3��и� : x���� y����
		else if ((x >= -1000 && x < 0) && (y >= -1000 && y < 0))
			System.out.println("3");
		// 4��и� : x��� y����
		else
			System.out.println("4");
	}
}

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		Quadrant quad = new Quadrant();
		quad.point(x, y);
	}
}
