package bronze.math;

import java.util.Scanner;

public class Study2292 {

	public static void main(String[] args) {
		// 벌집
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = 2;
		int count = 1;
		
		if(n == 1) System.out.println(1);
		else {
			while(start <= n) {
				
				start += 6 * count;
				
				count++;
			}
			
			System.out.println(count);
		}
		
		sc.close();
	}

}
