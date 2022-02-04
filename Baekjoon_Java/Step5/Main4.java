package Step5;

import java.io.*;

public class Main4 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean[] arr = new boolean[42];
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			int n = Integer.parseInt(br.readLine()) % 42;
			arr[n] = true;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == true)
				count++;
		}
		bw.write(count + "");
		bw.flush();
		bw.close();
		br.close();
	}
}
