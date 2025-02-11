package silver.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Study11651 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 좌표정렬하기2
		// 2차원 평면 위의 점 N개가 주어진다.
		// 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(stk.nextToken());
			}
		}
		
		Arrays.sort(arr, (i1, i2) -> {
			return i1[1] == i2[1] ? i1[0] - i2[0] : i1[1] - i2[1];
		});

		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
