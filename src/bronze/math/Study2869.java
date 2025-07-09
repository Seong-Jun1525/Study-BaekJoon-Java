package bronze.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Study2869 {

	public static void main(String[] args) throws IOException {
		/** 달팽이는 올라가고 싶다
		 * 
		 * A, B, V 를 입력받고 A만큼 증가 B만큼 감소 된 값이 V 이상이 될 때 반복 횟수 구하기
		 * 
		 * A - B : 하루 올라가는 높이
		 * 
		 * V - A : 마지막 날 전까지 올라가야 할 높이
		 * 
		 * => (V - A) / (A - B)
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 시간 초과 때문에 StringTokenizer 사용
		// => 내부적으로 더 적은 메모리를 사용하고, 불필요한 문자열 객체 생성을 피하여 성능상의 이점 얻는다
		StringTokenizer stk = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(stk.nextToken());
		int b = Integer.parseInt(stk.nextToken());
		int v = Integer.parseInt(stk.nextToken());
		
		int result = (int)Math.ceil((double)(v - a) / (a - b)) + 1;
		
		bw.write(result + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
