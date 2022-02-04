package Step5;

import java.io.*;
import java.util.*;

public class Main7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine()); // �׽�Ʈ���̽� ��
		
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int student = Integer.parseInt(st.nextToken()); // �л���
			int[] arr = new int[student];
			int sum = 0;
			Double avrg = 0.0; // ���
			
			for(int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			
			avrg = (double)sum / (double)student; // ��� Ȯ��
			
			int c = 0; // ��� �Ѵ� �л� ��
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] > avrg) c++;
			}
			
			Double rate = (double)c / (double)student * 100;
			
			System.out.printf("%.3f%%\n", rate);
		}
	}

}
