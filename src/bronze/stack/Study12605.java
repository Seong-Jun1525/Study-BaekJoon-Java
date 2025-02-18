package bronze.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Study12605 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String result = "";
			String[] strArr = br.readLine().split(" ");
			for(int j = 0; j < strArr.length; j++) {
				stack.push(strArr[j]);
			}
			
			while(!stack.isEmpty()) {
				result += stack.pop() + " ";
			}
			sb.append("Case #" + (int)(i+1) + ": " + result + "\n");
		}
		
		bw.write(sb + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
