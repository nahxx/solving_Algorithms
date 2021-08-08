package Step3_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		/* br.readLine().split(" ") ÀÌ¿כ
		String[] s = br.readLine().split(" ");
		
		int N = Integer.parseInt(s[0]);
		int X = Integer.parseInt(s[1]);
		*/
		
		int array[] = new int[N];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st2.nextToken());
			if (array[i] < X) 
				bw.write(array[i] + " ");
			}
		bw.write("\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
