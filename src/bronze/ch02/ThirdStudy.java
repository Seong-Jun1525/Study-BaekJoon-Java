package bronze.ch02;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdStudy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		Arrays.sort(arr);

		for(int a : arr) {
			System.out.print(a + " ");
		}
	}

}
