package Step2;

import java.util.*;

public class Main4 {
	/*
	 1 : +x +y
	 2 : -x +y
	 3 : -x -y
	 4 : +x -y
	 좌표 받아 어느 사분면인지 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x>0 && y>0)
			System.out.println("1");
		else if (x<0 && y>0)
			System.out.println("2");
		else if (x<0 && y<0)
			System.out.println("3");
		else
			System.out.println("4");
	}

}
