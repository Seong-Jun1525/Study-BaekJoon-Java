package gold.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Study9935 {

	public static void main(String[] args) throws IOException {
		// 문자열 폭발
		/**
		 * 첫번째로 문자열을 입력받기
		 * 두번째로 폭발 문자열을 입력받기
		 * 
		 * 폭발문자열이 문자열안에 있을 경우 반복문 실행
		 * 없다면 종료하고 문자열이 비었다면 -> FRULA 출력
		 * 그렇지 않다면 -> 문자열 출력
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();      // 원본 문자열
        String bombStr = br.readLine();  // 폭발 문자열
        int bombLen = bombStr.length();  // 폭발 문자열 길이

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);

            // 스택의 끝 부분이 폭발 문자열과 일치하는지 확인
            if (stack.size() >= bombLen) {
                boolean isBomb = true;

                // 폭발 문자열이 일치하는지 확인
                for (int i = 0; i < bombLen; i++) {
                    if (stack.get(stack.size() - bombLen + i) != bombStr.charAt(i)) {
                        isBomb = false;
                        break;
                    }
                }

                // 일치하면 폭발 문자열 길이만큼 pop
                if (isBomb) {
                    for (int i = 0; i < bombLen; i++) {
                        stack.pop();
                    }
                }
            }
        }

        // 스택이 비어 있으면 "FRULA" 출력
        if (stack.isEmpty()) {
            bw.write("FRULA\n");
        } else {
            StringBuilder result = new StringBuilder();
            for (char c : stack) {
                result.append(c);
            }
            bw.write(result.toString() + "\n");
        }
		// 메모리 초과
//		boolean flag = false;
//		
//		String str = br.readLine();
//		String bombStr = br.readLine();
//		if(str.contains(bombStr)) {
//			while(str.contains(bombStr)) {
//				str = str.replaceAll(bombStr, "");
//			}
//			if(str.length() > 0) flag = true;
//		} 
//
//		if(flag || !str.isEmpty()) {
//			bw.write(str + "\n");
//		} else {
//			bw.write("FRULA" + "\n");
//		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
