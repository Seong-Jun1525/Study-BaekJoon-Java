package gold.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Study17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 17298 오큰수 시간초과 발생.
		// StringTokenizer와 StringBuilder를 활용하자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] result = new int[n];
		
		// 배열 저장
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		
		for(int i = n - 1; i >= 0; i--) {
			int num = arr[i];
			
			if(stack.isEmpty()) {
				result[i] = -1;
				stack.push(num);
				continue;
			}
			
			int top = stack.peek();
			if(num < top) {
				result[i] = top;
			}
			else {
				while(!stack.isEmpty() && stack.peek() <= num) {
					stack.pop();
				}
				// 큰 수가 정답
				result[i] = stack.isEmpty() ? -1 : stack.peek();
			}
			
			stack.push(num);
		}

		StringBuilder sb = new StringBuilder();
		for(int a : result) {
			sb.append(a + " ");
		}
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
		br.close();
	}

}
