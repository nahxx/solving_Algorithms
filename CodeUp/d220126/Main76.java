package d220126;

import java.io.*;
// ���߿� �ٽ� Ǯ���

public class Main76 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char c = (char)br.read();
		for (char i = 'a'; i <= c; i++) {
			bw.write(String.valueOf((i)) + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
