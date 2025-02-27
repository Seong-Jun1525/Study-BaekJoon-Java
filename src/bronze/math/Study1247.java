package bronze.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Study1247 {

	public static void main(String[] args) {
		// 부호
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int turn = 0;
		String m = null;
		int n = null;
		BigInteger bi = null;
		BigInteger sum = new BigInteger("0");
		
		while(turn < 3) {
			n = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < n; i++) {
				m = br.readLine();
				
				bi = new BigInteger(m);
				sum.add(bi);
			}
			
			if(sum.equals(0)) sb.append("0");
			else if(sum > 0) sb.append("+");
			else sb.append("-");
			
			sb.append("\n");
			
			turn++;
			sum = 0;
		}
		
		System.out.println(sb);
		sc.close();
	}

}
