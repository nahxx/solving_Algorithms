package Step2;

import java.util.Scanner;

class Quadrant {
	int x, y;
	
	public void point(int x, int y) {
		
		this.x = x;
		this.y = y;
		// 1사분면 : x양수 y양수
		if ((x > 0 && x <= 1000) && (y > 0 && y <= 1000))
			System.out.println("1");
		// 2사분면 : x음수 y양수
		else if ((x >= -1000 && x < 0) && (y > 0 && y <= 1000))
			System.out.println("2");
		// 3사분면 : x음수 y음수
		else if ((x >= -1000 && x < 0) && (y >= -1000 && y < 0))
			System.out.println("3");
		// 4사분면 : x양수 y음수
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
