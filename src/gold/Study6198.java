package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Study6198 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 6198 옥상 정원 꾸미기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		long result = 0;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			
			while(!stack.isEmpty()) {
				if(stack.peek() <= m) {
					stack.pop();
				}
				else {
					break;
				}
			}
			result += stack.size();
			stack.push(m);
		}
		
		bw.write(result + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
