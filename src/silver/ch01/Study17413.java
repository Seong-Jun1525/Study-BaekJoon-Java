package silver.ch01;

import java.util.Scanner;
import java.util.Stack;

public class Study17413 {

	public static void main(String[] args) {
		// 17413 단어뒤집기2
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
        StringBuilder sb = new StringBuilder();
		
		Stack<Character> stack = new Stack<>();
		
		boolean flag = false;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == '<') {
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				flag = true;
			}
			else if(c == '>') {
				flag = false;
				sb.append(c);
				continue;
			}

			if(flag == true) {
				sb.append(c);
			}
			else if(flag == false) {
				if(c == ' ') {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(' ');
					continue;
				}
				else {
					stack.push(c);
				}
			}
			if(i == str.length() - 1) {
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
			}
		}
		
		System.out.println(sb);
	}
}