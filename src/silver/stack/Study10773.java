package silver.stack;

import java.util.Scanner;
import java.util.Stack;

public class Study10773 {

	public static void main(String[] args) {
		// 10773 제로
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if(num != 0) stack.push(num);
			else stack.pop();
		}
		
		for(int i : stack) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
