package d220126;

import java.util.*;

public class Main79 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		while(str != null) {
			if(str.equals("q")) {
				System.out.println(str);
				break;
			}
			else {
				System.out.println(str);
				str = sc.next();
			}

		}
	}

}
