package Step6;

public class Main2 {

	public static void main(String[] args) {
		int n;
		
		boolean[] arr = new boolean[10001];
		
		for(int i = 1; i < arr.length; i++) {
			int dn = getDn(i);
			if(dn < arr.length) {
				arr[dn] = true;
			}
		}
		
		for(int i = 1; i < arr.length; i++) {
			if(!arr[i]) System.out.println(i);	
		}	
	}

	private static int getDn(int n) {
		int sum = n;
		while(n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
