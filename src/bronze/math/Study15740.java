package bronze.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Study15740 {

	public static void main(String[] args) throws IOException {
		// 15740 a+b - 9
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		BigInteger a = new BigInteger(stk.nextToken());
		BigInteger b = new BigInteger(stk.nextToken());
		
		System.out.println(a.add(b));
	}

}
