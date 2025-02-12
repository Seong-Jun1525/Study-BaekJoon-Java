package silver.stack;

import java.io.*;
import java.util.Stack;

public class Study1406 {
    public static void main(String[] args) throws IOException {
    	// 에디터
    	// LinkedList를 사용하면 중간 데이터 삽입 삭제는 빠르지만 커서 이동이 o(n)이 걸림
    	// 그래서 스택 2개를 활용하는게 맞음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        String input = br.readLine();
        for (char c : input.toCharArray()) {
            left.push(c);
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            char op = command[0].charAt(0);

            switch (op) {
                case 'L': 
                    if (!left.isEmpty()) right.push(left.pop());
                    break;
                case 'D': 
                    if (!right.isEmpty()) left.push(right.pop());
                    break;
                case 'B':
                    if (!left.isEmpty()) left.pop();
                    break;
                case 'P':
                    left.push(command[1].charAt(0));
                    break;
            }
        }

        while (!left.isEmpty()) {
            right.push(left.pop());
        }
        while (!right.isEmpty()) {
            bw.write(right.pop());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}