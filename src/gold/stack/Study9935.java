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
		Stack<Character> stack = new Stack<>();
		
		String str = br.readLine();
		String bombStr = br.readLine();
		int j = 0;
		while(true) {
			if(str.contains(bombStr)) {
				for(int i = 0; i < str.length(); i++) {
					char c = str.charAt(i);
					
				}
			} else {
				break;
			}
		}
	}

}
