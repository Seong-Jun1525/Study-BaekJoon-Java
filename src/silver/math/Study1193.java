package silver.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Study1193 {

	/*
		대각선 방향으로 그룹화
	
		분수들은 (1/1), (1/2 → 2/1), (3/1 → 2/2 → 1/3), (1/4 → 2/3 → 3/2 → 4/1)처럼 대각선 방향으로 그룹이 형성돼.
		그룹 번호를 n이라 하면, n번째 그룹에는 n개의 분수가 있어.
		
		몇 번째 그룹인지 찾기
		입력 값 X가 속한 그룹 번호 n을 찾기 위해, 1부터 차례대로 1, 3, 6, 10, 15, ... 이런 식으로 누적 합을 계산해.
		1 + 2 + 3 + ... + n >= X가 되는 가장 작은 n을 찾으면, X는 n번째 그룹에 있어.
		
		그룹 내부에서 몇 번째인지 찾기
		n번째 그룹에서 첫 번째 숫자는 (n-1) * n / 2 + 1번째야.
		X가 그룹에서 몇 번째인지 알면, 분수의 형태를 알 수 있어.
		짝수 그룹이면 (큰 수/작은 수), 홀수 그룹이면 (작은 수/큰 수) 형태로 나타남.
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine()); // 수 입력받기

		// 몇 번째 그룹인지 찾기
		int n = 0;
		int sum = 0;
		while (sum < x) {
		    n++;
		    sum += n;
		}

		int pos = x - (sum - n);
		
		// n이 짝수일 경우 : (pos/n - pos + 1)
		// n이 홀수일 경우 : (n - pos + 1/pos)
		int a, b;
		if (n % 2 == 0) {  // 짝수 그룹
		    a = pos;
		    b = (n - pos + 1);
		} else {  // 홀수 그룹
		    a = (n - pos + 1);
		    b = pos;
		}
		
		bw.write(a + "/" + b);
		
		bw.flush();
		bw.close();
		br.close();
	}

}
