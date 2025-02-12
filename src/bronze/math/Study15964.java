package bronze.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Study15964 {
	
	public static long soluction(long a, long b) {
		if(a <= 1000 && b <= 1000) {
			return (a + b) * (a - b);
		}
		return (a + b) * (a - b);
	}

	public static void main(String[] args) throws IOException {
		// 15964 이상한 기호
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		bw.write(soluction(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken())) + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
