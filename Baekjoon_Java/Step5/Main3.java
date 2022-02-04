package Step5;

import java.io.*;

public class Main3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine())
				* Integer.parseInt(br.readLine());
		String result = Integer.toString(n);
		
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j < result.length(); j++)
				if((result.charAt(j)-'0') == i) count++;
			bw.write(count + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
