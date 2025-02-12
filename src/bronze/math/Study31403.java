package bronze.math;

import java.util.Scanner;

public class Study31403 {

	public static void main(String[] args) {
		// A + B - C
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		int c = sc.nextInt();
		
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b) - c);
		System.out.println(Integer.parseInt(a + b) - c);
	}

}
