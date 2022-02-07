package Step7;

import java.io.*;

public class Main3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] apb = new int[26];
		
		for(int i = 0; i < apb.length; i++) {
			apb[i] = -1;
		}
		
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			if(apb[str.charAt(i) - 97] == -1) {
				apb[str.charAt(i) - 97] = i;
			}
		}
		for(int i = 0; i < apb.length; i++) {
			bw.write(apb[i] + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
