package Step5;

import java.io.*;
import java.util.*;

public class Main1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		bw.write(arr[0] + " " + arr[arr.length - 1]);
		bw.flush();
		bw.close();
		br.close();
	}

}
