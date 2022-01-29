package Step1;

import java.util.*;
import java.io.*;

public class Main8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		float a = Float.parseFloat(st.nextToken());
		float b = Float.parseFloat(st.nextToken());
		br.close();
		System.out.println((double)a/b);
	}

}
