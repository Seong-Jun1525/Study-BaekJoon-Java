package bronze.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Study12605 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 단어 순서 뒤집기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		/**
		 * 입출력 속도 향상을 위해 스트림을 사용
		 * 
		 * 단순히 단어의 앞 뒤를 바꾸는 것이 아니기 때문에 reverse 관련된것 X
		 * 
		 * 입력받는 순서대로 스택에 담기 위해 Stack을 사용하였고 들어가는 값은 String이므로 제네릭설정
		 * 
		 * 출력 값을 연산이 끝나고 한번에 출력하기 위해서 StringBuilder를 사용하였다. 
		 */
		
		int n = Integer.parseInt(br.readLine()); // 몇 줄을 입력받을 것인지
		
		for(int i = 0; i < n; i++) {
			String result = "";
			String[] strArr = br.readLine().split(" "); // 입력받은 한 줄을 " "(공백)을 기준으로 나눠서 String[]에 저장
			for(int j = 0; j < strArr.length; j++) {
				stack.push(strArr[j]); // 공백을 기준으로 나눠진 단어들을 스택에 차례대로 저장
			}
			
			while(!stack.isEmpty()) {
				result += stack.pop() + " "; // 배열이 비어있지 않을 경우 스택에 저장된 단어들을 pop() 메서드를 사용하여 꺼내고 그것을 result에 연결
			}
			sb.append("Case #" + (int)(i+1) + ": " + result + "\n"); // 출력결과를 후에 한번에 하기 위해 StringBuilder에 append해서 저장
			// sb.append("Case #" + i+1 + ": " + result + "\n");
			// => 처음에 틀린 원인 : + 연산을 할 때 문자열과 같이 있으면 문자열연결연산자로 동작되므로 정수형 연산 부분은 ()로 묶어줘야한다.
		}
		
		bw.write(sb + "\n"); // write 메서드를 사용하여 출력결과를 담은 sb를 버퍼에 저장한다 (출력 X)
		bw.flush(); // 저장된 버퍼를 출력하기
		bw.close();
		br.close();
	}

}
