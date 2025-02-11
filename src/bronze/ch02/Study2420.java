package bronze.ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Study2420 {
	public static long soluction(long a, long b) {
		long result = a - b;
		return Math.abs(result);
	}

	public static void main(String[] args) throws IOException {
		// 사파리월드 2420
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());

		bw.write(soluction(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken())) + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
