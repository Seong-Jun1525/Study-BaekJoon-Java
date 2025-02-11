package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

class Top {
	int topNum;
	int topHeight;
	
	Top(int topNum, int topHeight) {
		this.topNum = topNum;
		this.topHeight = topHeight;
	}
}

public class FirstStudy {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str;
        int n = Integer.parseInt(br.readLine());
        
        Stack<Top> stack = new Stack<>();
        StringBuilder answer = new StringBuilder();
        str = br.readLine().split(" ");
        
        for(int i = 0; i < n; i++) {
        	int height = Integer.parseInt(str[i]);
        	
        	if(stack.isEmpty()) {
        		// 스택이 비어있을 경우 0을 출력하고 push
        		answer.append("0 ");
        		stack.push(new Top(i, height)); // 인덱스 번호와 높이를 push
        	}
        	else {
        		while(true) {
        			if(stack.isEmpty()) {
        				answer.append("0 ");
        				stack.push(new Top(i, height));
        				break;
        			}
        			
        			Top top = stack.peek(); // 스택에 top
        			
        			if(top.topHeight > height) {
        				// peek 한 top 의 높이가 현재 top 의 높이보다 높다면
        				// peek 한 top 의 번호를 출력하고 현재 탑을 push
        				answer.append((top.topNum+1) + " ");
        				stack.push(new Top(i, height));
        				break;
        			}
        			else {
        				stack.pop();
        			}
        		}
        	}
        }
        bw.write(answer.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
		
		// 내가 푼 것 메모리 초과
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		Stack<Integer> stack = new Stack<>();
//		Stack<Integer> result = new Stack<>();
//		
//		for(int i = 0; i < n; i++) {
//			int num = sc.nextInt();
//			stack.push(num);
//		}
//		
//		for(int i = 0; i < n; i++) {
//			int v = stack.pop();
//			int len = stack.size();
//			
//			for(int j = len - 1; j >= 0; j--) {
//				if(v <= stack.get(j)) {
//					result.push(j+1);
//					break;
//				}
//			}
//			
//			if(result.size() != (n - len)) {
//				result.push(0);
//			}
//		}
//		
//		for(int i = 0; i < n; i++) {
//			System.out.print(result.pop() + " ");
//		}
		
	}
}