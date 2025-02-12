package gold.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Study2504 {

	public static void main(String[] args) throws IOException {
		// 2504 괄호의 값 분배법칙 활용하여 풀기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Character> stack = new Stack<>();
		int result = 0;
		int cnt = 1;
		
		boolean flag = true;
		
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == '(') {
				stack.push(c);
				cnt *= 2;
			}
			else if(c == '[') {
				stack.push(c);
				cnt *= 3;
			}
			else {
				if(c == ')') {
					if(stack.isEmpty() || stack.peek() != '(') {
						flag = false;
						break;
					}
					if(str.charAt(i - 1) == '(') {
						result += cnt;
					}
					
					stack.pop();
					cnt /= 2;
				}
				else if(c == ']') {
					if(stack.isEmpty() || stack.peek() != '[') {
						flag = false;
						break;
					}
					if(str.charAt(i - 1) == '[') {
						result += cnt;
					}
					
					stack.pop();
					cnt /= 3;
				}
				else {
					flag = false;
					break;
				}
			}
		}
		
		if(!flag || !stack.isEmpty()) {
			bw.write(0 + "");
		}
		else {
			bw.write(result + "");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
