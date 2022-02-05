package Step6;

import java.io.*;

public class Main3 {

	public static void main(String[] args) throws IOException { // 1~n 사이의 한수 개수찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 양의정수 n 입력 받음
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(Han(Integer.parseInt(br.readLine())) + "");
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int Han(int n) {
		int count = 0;
		
		if(n < 100) {
			return n;
		}
		else {
			count = 99;
			if(n == 1000) return Han(999);
			
			for(int i = 100; i <= n; i++) {
				int hun = i/100;
				int ten = i%100/10;
				int one = i%10;
				
				if((hun-ten) == (ten-one)) count++;
			}
		}
		return count;
	}

}
