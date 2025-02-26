package bronze.math;

import java.util.Scanner;

public class Study11653 {

	public static void main(String[] args) {
		// 소인수분해
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		while(n > 1) {
			for(int i = 2; i <= n; i++) {
				if(n % i == 0) {
					n /= i;
					sb.append(i + "\n");
					break;
				}
			}
		}
		System.out.println(sb);
		
		sc.close();
	}

}
