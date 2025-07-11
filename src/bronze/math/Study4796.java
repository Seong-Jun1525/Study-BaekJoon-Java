package bronze.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Study4796 {

	public static void main(String[] args) throws IOException {
		// 캠핑 : 연속하는 P일 중, L일동안만 사용
		
		// L, P, V
		
		// V % P + V / P * L
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int idx = 1;
		while(true) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			
			int L = Integer.parseInt(stk.nextToken());
			int P = Integer.parseInt(stk.nextToken());
			int V = Integer.parseInt(stk.nextToken());
			
			if(L + P + V == 0) break;
			
			int result = 0;
			result = (V / P) * L;

            if (V % P <= L) result += V % P;
            else result += L;
			
			sb.append("Case " + idx++ + ": " + result + "\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		bw.close();
		br.close();
		
	}

}
