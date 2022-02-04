package Step5;

import java.io.*;
import java.util.*;

public class Main5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[count];
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] > max) max = arr[i];
		}
		
		double sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += ((double)arr[i] / (double)max) * 100;		
		}
		bw.write(sum / count + "");
		bw.flush();
		bw.close();
		br.close();
		
	}

}
