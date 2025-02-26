package bronze.math;

import java.util.Scanner;

public class Study11050 {

	public static void main(String[] args) {
		// 이항계수 1
		// 이항계수 공식
		/*
		 * n! / (n-k)! * k!
		 * 
		 * 이항 계수는 K가 0이거나 N과 K가 같으면 가능한 경우의 수가 1이므로 결과값이 1이다.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int m = n - k;
		
		if(!(k > 0 && n != k)) {
			System.out.println(1);
		} else {
			System.out.println(factorial(n) / (factorial(m) * factorial(k)));
		}
		
		sc.close();
	}
	
	public static long factorial(int n) {
		if(n == 1 || n == 0) return 1;
		return n * factorial(n-1);
	}

}
