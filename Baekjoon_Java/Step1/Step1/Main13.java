package Step1;

import java.util.*;
import java.io.*;

public class Main13 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println(a * (b%10));
		System.out.println(a * (b%100/10));
		System.out.println(a * (b/100));
		System.out.println(a * b);

	}

}
