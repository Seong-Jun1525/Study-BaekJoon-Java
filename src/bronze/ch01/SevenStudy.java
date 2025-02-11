package bronze.ch01;

import java.util.Scanner;

public class SevenStudy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, n;
		
		for(int i = 0; i < 2; i++) {
			n = sc.nextInt();
			sum += n;
		}
		
		System.out.println(sum);
	}

}
