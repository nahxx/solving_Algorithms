package Step3;

import java.io.*;

public class Main10 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--)
				bw.write(" ");
			for (int k = 1; k <= i; k++)
				bw.write("*");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
				
	}

}
