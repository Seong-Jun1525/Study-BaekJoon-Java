package silver.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Study3273 {

	public static void main(String[] args) throws IOException {
		// 3273 두 수의 합 투 포인터 활용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int count = 0;
		
		// 수열의 크기
		int n = Integer.parseInt(stk.nextToken());
		int[] arr = new int[n];

		// 수열에 포함되는 수
		stk = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}

		stk = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(stk.nextToken());
		
		Arrays.sort(arr);
		
		// 투 포인터 활용
		int firstPointer = 0;
		int secondPointer = n - 1;
		
		while(firstPointer < secondPointer) {
			int sum = arr[firstPointer] + arr[secondPointer];
            if (sum == m) {
                count++;
                firstPointer++;
                secondPointer--;
            } else if (sum < m) {
            	firstPointer++;
            } else {
            	secondPointer--;
            }
		}
		
		System.out.println(count);
	}

}
