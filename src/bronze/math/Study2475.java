package bronze.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Study2475 {

	public static void main(String[] args) throws IOException {
		// 검증수 2475
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int sum = 0;
		
		int[] arr = new int[stk.countTokens()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		
		for(int a : arr) {
			sum += a * a;
		}
		
		bw.write(sum % 10 + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
