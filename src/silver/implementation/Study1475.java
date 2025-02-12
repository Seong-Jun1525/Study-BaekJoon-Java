package silver.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study1475 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 방 배정 1475
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 1; // 세트 수

		String[] str = br.readLine().split("");

		for(String s : str) {
			System.out.print(s + " ");
		}
		System.out.println();
		int[] arr = new int[10];
		
		for(int i = 0; i < str.length; i++) {
			int m = Integer.parseInt(str[i]);
			
			if(arr[m] == 0) arr[m]++;
			else if((m == 9 && arr[9] == 0) && arr[6] < 2) {
				arr[6]++;
			}
			else if((m == 6 && arr[6] == 0) && arr[9] < 2) {
				arr[9]++;
			}
			else if(arr[m] == m || arr[m] != 0) count++;
		}

		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.println(count);
	}

}
