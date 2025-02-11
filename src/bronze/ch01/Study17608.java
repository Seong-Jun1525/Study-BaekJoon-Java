package bronze.ch01;

import java.util.Scanner;
import java.util.Stack;

public class Study17608 {

	public static void main(String[] args) {
		// 17608 막대기
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int count = 1;
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			stack.push(num);
		}
		int top = stack.pop();
		for(int i = 0; i < n - 1; i++) {
			if(stack.peek() > top) {
				top = stack.pop();
				count += 1;
			}
			else {
				stack.pop();
			}
		}
		System.out.println(count);
	}
}