package Step3_for;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
		// [�������] 2 * 1 = 2
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i < 10; i++)
			System.out.println(n + " * " + i + " = " + (n * i));
	}
}
