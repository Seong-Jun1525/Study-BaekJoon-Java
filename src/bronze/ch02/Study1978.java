package bronze.ch02;

import java.util.Scanner;

public class Study1978 {
	
	public static boolean isPrime(int n) {
		for(int i = 2; i < n-1; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// 1978 소수찾기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if(num == 1) {
				continue;
			}
			else if(isPrime(num)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
