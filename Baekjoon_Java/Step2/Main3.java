package Step2;

import java.io.*;

public class Main3 {
	/*
	 ���� : 4�� ����̸鼭 100�� ����� �ƴҶ�, �Ǵ� 400�� ����϶�
	 �����̸� 1, �ƴϸ� 0 ���
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y = Integer.parseInt(br.readLine());
		
		if ((y%400 != 0) && !((y%4 == 0) && (y%100 != 0)))
			System.out.println("0");
		else
			System.out.println("1");
	}

}
