package bronze.math;

import java.util.Scanner;

public class Study2609 {

	public static void main(String[] args) {
		// 최대공약수와 최소공배수
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		System.out.println(gcd(x, y));
		System.out.println(lcm(x, y));
		
	}
	
	public static int gcd(int a, int b) {
		while(b != 0) {
			int remainder = a % b;
			a = b;
			b = remainder;
		}
		return a;
	}
	
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

}
