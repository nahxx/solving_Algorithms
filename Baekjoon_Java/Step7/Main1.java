package Step7;

import java.io.*;

public class Main1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char c = (char)br.read();
		bw.write((int)c + "");
		bw.flush();
		bw.close();
	}

}
