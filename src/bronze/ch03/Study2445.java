package bronze.ch03;

import java.util.Scanner;

public class Study2445 {

	public static void main(String[] args) {
		// 별 찍기 - 8 // 미해결
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < 2 * n - 1; i++) {
			if(i < n) {
				for(int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				for(int j = (n - 1); j >= i+1; j--) {
					System.out.print(" ");
				}
				for(int j = (n - 1); j >= i+1; j--) {
					System.out.print(" ");
				}
				for(int j = i; j >= 0; j--) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for(int j = n-1; j >= 1; j--) {
					System.out.print("*");
				}
				for(int j = i; j < i+1-n; j++) {
					System.out.print(" ");
				}
				for(int j = i+1-n; j <= i+1-n; j++) {
					System.out.print(" ");
				}
				for(int j = n-1; j >= 1; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
