package silver.queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Study10845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 10845 큐
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
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
			}
			else if("size".equals(str)) {
				bw.write(queue.size() + "\n");
			}
			else if("empty".equals(str)) {
				bw.write((queue.isEmpty() ? "1" : "0") + "\n");
			}
			else if("front".equals(str)) {
				bw.write((queue.isEmpty() ? "-1" : queue.getFirst()) + "\n");
			}
			else if("back".equals(str)) {
				bw.write((queue.isEmpty() ? "-1" : queue.getLast()) + "\n");
			}
			n--;
		}
		bw.flush(); // 출력 버퍼 비우기
        bw.close();
	}

}
