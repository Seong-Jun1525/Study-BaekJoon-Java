package gold.sort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Study1715 {

	public static void main(String[] args) {
		// 1715 카드 정렬 (미해결)
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> queue = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		int sum = 0;
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			queue.addLast(sc.nextInt());
		}
		
		Collections.sort(queue);
		
		for(int i = 1; i < n; i++) {
			int result = queue.get(i - 1) + queue.get(i);
			System.out.println(result);
			stack.push(result);
		}

		for(int i = 0; i < stack.size(); i++) {
			sum += stack.pop();
		}
		
		System.out.println(sum);
	}

}
