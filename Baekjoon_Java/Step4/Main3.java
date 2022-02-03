package Step4;

import java.io.*;

public class Main3 {
/*
 26부터 시작한다.
 2+6 = 8이다. 새로운 수는 68이다. 
 6+8 = 14이다. 새로운 수는 84이다. 
 8+4 = 12이다. 새로운 수는 42이다. 
 4+2 = 6이다. 새로운 수는 26이다.
 26의 사이클의 길이는 4이다.
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
