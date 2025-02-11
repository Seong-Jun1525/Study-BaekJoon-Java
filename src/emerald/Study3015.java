package emerald;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Study3015 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 3015 오아시스 재결합 미해결
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		long result = 0;
		
		for(int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			
			while(!stack.isEmpty()) {
				if(stack.peek() < m) {
					if(stack.size() == 1) {
						stack.pop();
						break;
					}
					for(int j = 0; j < stack.size() - 1; j++) {
						stack.pop();
						result++;
					}
				}
				else {
					break;
				}
			}

			stack.push(m);
		}
		
		bw.write(result * 2 + "");
		bw.flush();
		bw.close();
		br.close();	
	}

}
