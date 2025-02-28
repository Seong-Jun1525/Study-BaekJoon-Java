package silver.math;

import java.util.Scanner;

public class Study2292 {

	public static void main(String[] args) {
		// 벌집
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(method(n));
		sc.close();
	}
	
	public static long method(long n) {
		long count = 1;
		long j = 6;
		
		while(true) {
			for(long i = j; i >= j / 6; i--) {
				if(i == n) return count;
			}
			System.out.println(j);
			count++;
			j *= 2;
		}
	}

}
