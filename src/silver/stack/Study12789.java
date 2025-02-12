package silver.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Study12789 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 도키도키 간식 드리미
		// 승환이 앞에 몇 명이 있는지 N을 입력받고 1 <= N까지 입력해서 배열 저장
		// 숫자 순서대로 pop() 되도록 해야함
		// 5 4 1 3 2 일경우
		// 1 2 3 4 5 순으로 pop() 해야함 (정렬 x)
		// 마지막에 스택이 비어있으면 "Nice" 비어있지 않으면 "Sad" 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		int num = 1;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		int idx = 0;
		while(true) {
			if(idx < N) {
				if(arr[idx] == num) {
					arr[idx++] = 0;
					num++;
//					System.out.println("실행 1");
				} else {
					if(!stack.isEmpty() && stack.peek() == num) {
						stack.pop();
						num++;
//						System.out.println("실행 2");
					} else {
						stack.push(arr[idx++]);
//						System.out.println("실행 3");
					}
				}
			} else {
				if(stack.isEmpty()) {
//					System.out.println("실행 4");
					break;
				}
				else if(stack.peek() == num){
//					System.out.println("실행 5");
					stack.pop();
					num++;
				} else {
//					System.out.println("실행 6");
					break;
				}
			}
//			System.out.println("num : " + num);
//			System.out.println(stack);
		}

		if(stack.isEmpty()) {
			bw.write("Nice" + "\n");
		} else {
			bw.write("Sad" + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
