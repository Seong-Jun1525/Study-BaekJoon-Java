package silver.stack;

import java.util.Scanner;
import java.util.Stack;

public class Study1874 {

	public static void main(String[] args) {
		// 1874 스택수열
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		int n = sc.nextInt();
		int max = 0;
		
		for(int i = 0; i < n; i++) { // 입력받은 n 개만큼 반복
			int num = sc.nextInt();
			
			if(num > max) {
				for(int j = max + 1; j <= num; j++) {
					stack.push(j);	
					sb.append('+').append('\n');
				}
				max = num;
			}
			else if(stack.peek() != num) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append('-').append('\n');
		}
		
		System.out.println(sb);
	}

}
