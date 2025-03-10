package silver.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Study1003 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 피보나치 함수 미해결
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		int zCount = 0;
		int oCount = 0;
		
		for(int i = 0; i < t; i++) {
			int num = Integer.parseInt(br.readLine());
			
			int r = fibonacci(num);
			if(r == 0) {
				zCount++;
			} else if(r == 1) {
				oCount++;
			}
			sb.append(zCount + " " + oCount + "\n");
			zCount = 0;
			oCount = 0;
		}
		
		bw.write(sb + "");
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	public static int fibonacci(int n) {
	    if (n == 0) {
//	        System.out.println(0);
	        return 0;
	    } else if (n == 1) {
//	        System.out.println(1);
	        return 1;
	    } else {
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	}

}
