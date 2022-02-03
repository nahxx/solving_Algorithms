package Step2;

import java.io.*;
import java.util.*;

public class Main5 {
	/*
	 45분 일찍 설정하기
	 */

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		m -= 45;
		if(m<0) {
			m = 60 + m;
			if (h == 0)
				h = 23;
			else	
				h--;
		}
		System.out.println(h + " " + m);
	}

}
