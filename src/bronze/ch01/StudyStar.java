package bronze.ch01;

import java.util.Scanner;

public class StudyStar {

	public static void main(String[] args) {
		// 별찍기 모음
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
//		for(int i = 0; i < n; i++) {
//			for(int j = n; j > i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("=====================");
//		
//		for(int i = 0; i < n; i++) {
//			if(count > 0) {
//				for(int j = 0; j < count; j++) {
//					System.out.print(" ");
//				}
//			}
//			for(int j = n; j > i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//			count++;
//		}
//
//		System.out.println("=====================");
//		
//		for(int i = 1; i <= n; i++) {
//			for(int j = n - 1; j >= i; j--) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= 2 * i - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		System.out.println("=====================");
//		count = 0;
//		for(int i = n; i >= 1; i--) {
//			if(count > 0) {
//				for(int j = 1; j <= count; j++) {
//					System.out.print(" ");
//				}
//			}
//			for(int j = 2 * i - 1; j >= 1; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//			count++;
//		}
//
//		System.out.println("=====================");
		count = 0;
		boolean flag = false;
		if(!flag) {
			for(int k = n; k >= 1; k--) {
				if(count > 0) {
					for(int j = 1; j <= count; j++) {
						System.out.print(" ");
					}
				}
				for(int j = 2 * k - 1; j >= 1; j--) {
					System.out.print("*");
				}
				System.out.println();
				count++;
				if(count == n-1) {
					flag = true;
					count = 1;
					break;
				}
			}
		}
		if(flag) {
			for(int k = 1; k <= n; k++) {
				for(int j = n - 1; j >= k; j--) {
					System.out.print(" ");
				}
				for(int j = 1; j <= 2 * k - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
