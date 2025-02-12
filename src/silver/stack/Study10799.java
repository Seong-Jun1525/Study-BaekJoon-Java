package silver.stack;

import java.util.Scanner;
import java.util.Stack;

public class Study10799 {

	public static void main(String[] args) {
		// 쇠막대기 10799
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		String str = sc.nextLine();
		
		int answer = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			}
			else if(str.charAt(i) == ')') {
				stack.pop();
				
				if(!stack.isEmpty() && str.charAt(i - 1) == '(') {
					answer += stack.size();
				}
				else if(str.charAt(i - 1) == ')') {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}