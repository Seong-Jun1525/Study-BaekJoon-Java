package bronze.math;

import java.util.Scanner;

public class Study1085 {

	public static void main(String[] args) {
		/** 직사각형에서 탈출
		 * w - x
		 * h - y
		 * x, y
		 */
		
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int result = Math.min(Math.min(w - x, h - y), Math.min(x, y));
		
		System.out.println(result);
		sc.close();
	}

}
