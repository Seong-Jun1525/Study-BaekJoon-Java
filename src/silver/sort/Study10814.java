package silver.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Study10814 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 나이순 정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int n = Integer.parseInt(br.readLine());
 
		StringBuilder[] p = new StringBuilder[201];

		for(int i = 0; i < p.length; i++) {
			p[i] = new StringBuilder();
		}
		
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			p[age].append(age).append(' ').append(name).append('\n');
		}
		
		StringBuilder sb = new StringBuilder();
		for(StringBuilder val : p) {
			sb.append(val);
		}
        
		bw.write(sb + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
