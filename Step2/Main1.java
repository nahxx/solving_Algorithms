package Step2;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		//�� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		if (a > b)
			System.out.println(">");
		else if (a == b)
			System.out.println("==");
		else
			System.out.println("<");
	}

}
