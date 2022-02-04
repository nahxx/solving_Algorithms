package Step5;

import java.io.*;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[9];
		int max = 0;
		int index = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		bw.write(max + "\n" + (index+1));
		bw.flush();
		bw.close();
		br.close();
	}

}
