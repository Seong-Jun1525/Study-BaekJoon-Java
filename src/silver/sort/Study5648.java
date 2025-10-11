package silver.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Study5648 {

	public static void main(String[] args) {
		/** 역원소 정렬
		 * 모든 원소가 양의 정수인 집합이 있을 때, 원소를 거꾸로 뒤집고
		 * 그 원소를 오름차순으로 정렬하는 프로그램을 작성하세요.
		 * 단, 원소를 뒤집었을 때 0이 앞에 선행되는 경우는 0을 생략해야합니다.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		String num = "";
		long[] arr = new long[n];
		
		for(int i = 0; i < n; i++) {
			num = sc.nextLong() + "";
			
			String[] temp = num.split("");
			StringBuilder sb = new StringBuilder();

			char[] ch = num.toCharArray();
			
			for(int j = temp.length - 1; j >= 0; j--) {
				if (!flag && ch[j] == '0') continue;
				else {
					flag = true;
					sb.append(temp[j]);
				}
			}
			flag = false;
			arr[i] = Long.parseLong(sb.toString());
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
