package silver.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Study1789 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 수들의 합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long n = Long.parseLong(br.readLine());

		long idx = 1;
		int count = 0;
		long sum = 0;
		while(true) {
			if(sum > n) break;
			sum += idx++;
			count++;
		}

		bw.write((count-1) + "");
		bw.flush();
		bw.close();
		br.close();
	}
}
