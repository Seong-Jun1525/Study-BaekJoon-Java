package bronze.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Study1247 {

	public static void main(String[] args) throws IOException {
		// 부호
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int turn = 0; // 총 테스트 수의 초기값
		int n = 0; // 입력받을 갯수
		String m = null; // 입력받을 문자열
		BigInteger bi = null; // 입력받은 문자열을 BigInteger로 변환하여 담을 변수
		BigInteger sum = new BigInteger("0"); // 입력받은 정수들의 합
		BigInteger a = new BigInteger("0"); // 연산 후 0과 비교하기 위해
		
		while(turn < 3) { // 테스트는 0 ~ 2 총 3번 반복
			n = Integer.parseInt(br.readLine()); // 한번의 테스트에서 입력받을 갯수
			
			for(int i = 0; i < n; i++) {
				m = br.readLine();
				
				bi = new BigInteger(m);
				sum = sum.add(bi);
			}
			
			if(sum.compareTo(a) == 1)  sb.append("+");
			else if(sum.compareTo(a) == -1) sb.append("-");
			else sb.append("0");

			sb.append("\n");
			
			sum = new BigInteger("0");
			turn++; // 테스트 수 증가
		}
		
		System.out.println(sb);
		br.close();
	}

}
