package silver.ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class ThirdStudy {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 시간초과 발생
		 	import java.util.LinkedList;
			import java.util.Scanner;
			public class Main {
				public static void main(String[] args) {
					// 18258 큐 2
					Scanner sc = new Scanner(System.in);
					LinkedList<Integer> queue = new LinkedList<>();
					int n = sc.nextInt();
					sc.nextLine();
					for(int i = 1; i <= n; i++) {
						String str = sc.nextLine();
						if(str.startsWith("push")) {
							String[] strArr = str.split(" ");
							if(strArr.length == 2) {
								int num = Integer.parseInt(strArr[1]);
								queue.add(num);
							}
						}
						else if(str.startsWith("pop")) {
							if(queue.isEmpty()) {
								System.out.println(-1);
							}
							else {
								System.out.println(queue.poll());
							}
						}
						else if(str.startsWith("size")) {
							System.out.println(queue.size());
						}
						else if(str.startsWith("empty")) {
							if(queue.isEmpty()) {
								System.out.println(1);
							}
							else {
								System.out.println(0);
							}
						}
						else if(str.startsWith("front")) {
							if(queue.isEmpty()) {
								System.out.println(-1);
							}
							else {
								System.out.println(queue.getFirst());
							}
						}
						else if(str.startsWith("back")) {
							if(queue.isEmpty()) {
								System.out.println(-1);
							}
							else {
								System.out.println(queue.getLast());
							}
						}
					}
				}
			}
		 */
		// 18258 큐 2
		/**
		 * push X: 정수 X를 큐에 넣는 연산이다.
		 * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 * size: 큐에 들어있는 정수의 개수를 출력한다.
		 * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
		 * front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 * back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> queue = new LinkedList<>();
		
		int n = Integer.parseInt(br.readLine());
		
		while(n > 0) {
			String str = br.readLine();
			
			if(str.startsWith("push")) {
				int num = Integer.parseInt(str.substring(5)); // "push " 이후의 숫자 추출
                queue.addLast(num);
			}
			else if(str.startsWith("pop")) {
				bw.write((queue.isEmpty() ? "-1" : queue.removeFirst()) + "\n");
//				sb.append((queue.isEmpty() ? "-1" : queue.removeFirst()) + "\n");
			}
			else if("size".equals(str)) {
				bw.write(queue.size() + "\n");
//				sb.append(queue.size() + "\n");
			}
			else if("empty".equals(str)) {
				bw.write((queue.isEmpty() ? "1" : "0") + "\n");
//				sb.append((queue.isEmpty() ? "1" : "0") + "\n");
			}
			else if("front".equals(str)) {
				bw.write((queue.isEmpty() ? "-1" : queue.getFirst()) + "\n");
//				sb.append((queue.isEmpty() ? "1" : queue.getFirst()) + "\n");
			}
			else if("back".equals(str)) {
				bw.write((queue.isEmpty() ? "-1" : queue.getLast()) + "\n");
//				sb.append((queue.isEmpty() ? "-1" : queue.getLast()) + "\n");
			}
			n--;
		}
		bw.flush(); // 출력 버퍼 비우기
        bw.close();
//		System.out.print(sb);
	}

}
