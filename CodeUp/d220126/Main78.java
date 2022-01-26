package d220126;
import java.util.*;

public class Main78 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int last = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= last; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println(sum);

	}

}
