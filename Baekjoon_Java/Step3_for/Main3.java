package Step3_for;

import java.util.*;

public class Main3 {

	public static void main(String[] args) {
		//n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < (n + 1); i++)
			sum += i;
		System.out.println(sum);
	}

}
