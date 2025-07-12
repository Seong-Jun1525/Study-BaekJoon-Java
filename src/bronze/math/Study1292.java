package bronze.math;

import java.util.Scanner;

public class Study1292 {

	public static void main(String[] args) {
		// 쉽게 푸는 문제
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] arr = new int[1000];
		
		int idx = 0;
		for(int i = 1; idx < 1000; i++) {
		    for(int j = 0; j < i && idx < 1000; j++) {
		        arr[idx++] = i;
		    }
		}
		
		int sum = 0;
		for(int i = a - 1; i <= b - 1; i++) {
            sum += arr[i];
        }
		
		System.out.println(sum);
		sc.close();
	} 

}
