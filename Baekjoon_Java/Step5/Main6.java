package Step5;

import java.io.*;
import java.util.*;

public class Main6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		String[] arr = new String[count];
		
		for(int i = 0; i < count; i++) {
			arr[i] = br.readLine();
			
			int o = 0;
			int score = 0;
			
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					o++;
				}
				else {
					o = 0;
				}
				score += o;
			}
			bw.write(score + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
	}

}
