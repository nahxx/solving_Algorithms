package d220126;
import java.util.*;

public class Main80 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += i;
			if (sum >= n) {
				System.out.println(i);
				break;
			}
		}
	}

}
