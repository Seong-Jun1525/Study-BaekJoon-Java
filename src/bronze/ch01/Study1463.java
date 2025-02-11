package bronze.ch01;

import java.util.Scanner;

public class Study1463 {
	static Integer[] dp;

	public static void main(String[] args) {
		// 1463번 1로 만들기
		Scanner sc = new Scanner(System.in);
		
		int value = sc.nextInt();
		
		dp = new Integer[value + 1];
		dp[0] = dp[1] = 0;
		
		System.out.println(recur(value));
	}
	
	static int recur(int n) {
		if(dp[n] == null) {
			if(n % 6 == 0) {
				dp[n] = Math.min(Math.min(recur(n / 3), recur(n / 2)), recur(n-1)) + 1;
			}
			else if(n % 3 == 0) {
				dp[n] = Math.min(recur(n / 3), recur(n-1)) + 1;
			}
			else if(n % 2 == 0) {
				dp[n] = Math.min(recur(n / 2), recur(n-1)) + 1;
			}
			else {
				dp[n] = recur(n-1) + 1;
			}
		}
		return dp[n];
	}
}