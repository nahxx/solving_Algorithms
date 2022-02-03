package Step2;

import java.io.*;

public class Main3 {
	/*
	 윤년 : 4의 배수이면서 100의 배수가 아닐때, 또는 400의 배수일때
	 윤년이면 1, 아니면 0 출력
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y = Integer.parseInt(br.readLine());
		
		if ((y%400 != 0) && !((y%4 == 0) && (y%100 != 0)))
			System.out.println("0");
		else
			System.out.println("1");
	}

}
