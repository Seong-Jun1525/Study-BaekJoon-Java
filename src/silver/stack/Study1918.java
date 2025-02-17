package silver.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Study1918 {

	public static void main(String[] args) throws IOException {
		// 후위표기식2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        String strArr = br.readLine();
        
        for(int i = 0; i < strArr.length(); i++) {
            char c = strArr.charAt(i);
            
            if ('A' <= c && c <= 'Z') {  // 피연산자 (문자)라면 바로 출력
                sb.append(c);
            } else if (c == '(') {  // 여는 괄호는 무조건 push
                stack.push(c);
            } else if (c == ')') {  // 닫는 괄호일 경우 '(' 나올 때까지 pop
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop(); // '(' 제거
            } else {  // 연산자일 경우
                while (!stack.isEmpty() && priority(stack.peek()) >= priority(c)) {
                    sb.append(stack.pop());
                }
                stack.push(c);
            }
        }
        
        // 스택에 남은 연산자들을 모두 출력
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        bw.write(sb + "");

        bw.flush();
        bw.close();
        br.close();
	}
	
	static int priority(char op) {
	    if (op == '(') return 0;  // '('는 우선순위가 가장 낮음
	    if (op == '+' || op == '-') return 1;
	    if (op == '*' || op == '/') return 2;
	    return -1;
	}
}
