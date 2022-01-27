package d220127;

import java.util.*;

public class Main82 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n16 = Integer.parseInt(sc.next(), 16);
		for (int i = 1; i < 16; i++) {
			System.out.printf("%H*%H=%H\n", n16, i, n16*i);
		}
		
	}

}
