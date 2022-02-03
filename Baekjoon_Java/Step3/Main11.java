package Step3;

import java.io.*;
import java.util.*;

public class Main11 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < count; i++) {
			int n = Integer.parseInt(st.nextToken());
			if (n < x)
				bw.write(n + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
