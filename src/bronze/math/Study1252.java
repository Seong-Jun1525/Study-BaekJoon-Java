package bronze.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Study1252 {

	public static void main(String[] args) throws IOException {
		// 이진수 더하기
		// toBinaryString -> 10진수를 2진수로
		// parseInt -> 2진수를 10진수로
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		BigInteger bi1 = new BigInteger(stk.nextToken(), 2);
		BigInteger bi2 = new BigInteger(stk.nextToken(), 2);
		
		BigInteger sum = bi1.add(bi2);
		

		bw.write(sum.toString(2) + "");

		// 80bit 이면 long 형의 값도 초과..
//		String[] strArr = br.readLine().split(" ");
//
//		bw.write(
//				Long.toBinaryString(
//			    Long.parseLong(strArr[0], 2) + Long.parseLong(strArr[0], 2)) + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
