package silver.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Study1935 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 후위 표기식2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		char[] cArr = br.readLine().toCharArray();
		
		sb.append(cArr);
		
		for(int i = 0; i < n; i++) {
			
		}
		
	}

}
