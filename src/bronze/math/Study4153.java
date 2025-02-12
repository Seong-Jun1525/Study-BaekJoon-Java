package bronze.math;

import java.util.Scanner;

public class Study4153 {

	public static void main(String[] args) {
		// 직각삼각형
		// 3의 배수, 4의 배수, 5의 배수이어야 함
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if(a == 0 && b == 0 && c == 0) break;
			
			// a² = b² + c² 의 조건을 만족해야함
			
			if((a * a + b * b) == c * c) {
				System.out.println("right");
			}
        	else if(a * a == (b * b + c * c)) {
				System.out.println("right");
			}
        	else if(b * b == (c * c + a * a)) {
				System.out.println("right");
			}
        	else {
				System.out.println("wrong");
			}
			
		}
	}

}
