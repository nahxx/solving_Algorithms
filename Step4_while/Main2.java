package Step4_while;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = "";
		int a = 0;
		int b = 0;
		while ((input = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(input);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write(a + b + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
