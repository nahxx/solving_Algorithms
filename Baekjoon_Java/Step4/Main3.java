package Step4;

import java.io.*;

public class Main3 {
/*
 26���� �����Ѵ�.
 2+6 = 8�̴�. ���ο� ���� 68�̴�. 
 6+8 = 14�̴�. ���ο� ���� 84�̴�. 
 8+4 = 12�̴�. ���ο� ���� 42�̴�. 
 4+2 = 6�̴�. ���ο� ���� 26�̴�.
 26�� ����Ŭ�� ���̴� 4�̴�.
 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		int m = n;

		while(true) {
			int ten = m / 10;
			int one = m % 10;
			m = (one * 10) + ((ten + one) % 10);
			count++;
			if(n == m)
				break;
		}
		bw.write(count + "");
		bw.flush();
		bw.close();
		br.close();
	}
}
