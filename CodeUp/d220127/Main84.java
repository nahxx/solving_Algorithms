package d220127;

import java.io.*;

public class Main84 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split(" ");
		int count = 0;
		for (int i = 0; i < Integer.valueOf(arr[0]); i++) {
			for (int j = 0; j < Integer.valueOf(arr[1]); j++) {
				for (int k = 0; k < Integer.valueOf(arr[2]); k++) {
					bw.write(i + " " + j + " " + k + "\n");
					count++;
				}
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
	}

}
