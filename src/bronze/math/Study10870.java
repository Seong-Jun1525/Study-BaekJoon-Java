package bronze.math;

import java.util.Scanner;

public class Study10870 {

	public static void main(String[] args) {
		// 피보나치의 수5
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		
		if(n == 0) System.out.println(0);
		else {
			for(int i = 0; i < n - 1; i++) {
				int r = a + b;
				a = b;
				b = r;
			}
			
			System.out.println(b);
		}
		sc.close();
	}

}
