package bronze.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Study2750 {

	public static void main(String[] args) {
		// 2750 수 정렬하기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrL = new int[n];
		
		for(int i = 0; i < n; i++) {
			arrL[i] = sc.nextInt();
		}

		Arrays.sort(arrL);
		
		for(int i = 0; i < n; i++) {
			System.out.println(arrL[i]);
		}
	}

}