package silver.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class TenStudy {

	public static void main(String[] args) throws IOException {
		// 시간초과 발생
//		Scanner sc = new Scanner(System.in);
//		Stack<Integer> stack = new Stack<>();
//		List<String> list = new ArrayList<String>();
//		int n = sc.nextInt();
//		sc.nextLine(); // 버퍼 비우기
//		
//		for(int i = 0; i < n; i++) {
//			list.add(sc.nextLine());
//		}
//		
//		for(String o : list) {
//			if(o.startsWith("1")) {
//				String[] str = o.split(" ");
//				if(str.length == 2) {
//					stack.push(Integer.parseInt(str[1]));
//				}
//			}
//			else if(o.startsWith("2")) {
//				if(stack.isEmpty()) System.out.println(-1);
//				else System.out.println(stack.pop());
//			}
//			else if(o.startsWith("3")) {
//				System.out.println(stack.size());
//			}
//			else if(o.startsWith("4")) {
//				if(stack.isEmpty()) System.out.println(1);
//				else System.out.println(0);
//			}
//			else if(o.startsWith("5")) {
//				if(stack.isEmpty()) System.out.println(-1);
//				else System.out.println(stack.peek());
//			}
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine()); // 명령 수

        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            if (command.startsWith("1")) {
                String[] parts = command.split(" ");
                stack.push(Integer.parseInt(parts[1]));
            } else if (command.equals("2")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            } else if (command.equals("3")) {
                sb.append(stack.size()).append("\n");
            } else if (command.equals("4")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("5")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }

        System.out.print(sb);
	}

}
