package d220126;
import java.util.*;


public class Main71 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		while(str != null) {
			int n = Integer.parseInt(str);
			if(n == 0)
				break;
			else {
				System.out.println(n);
				str = sc.next();
			}	
		}
	}

}
