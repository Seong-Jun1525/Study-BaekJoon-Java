package bronze.ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Study9093 {
	
	public static void soluction(String str) {
		for(int i = str.length() - 1; i >= 0 ; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 9093 단어 뒤집기 1차 틀림, 2차 시간초과
		// 시간 초과 발생원인은 아마 Scanner + 너무 많은 for문 때문일듯 싶음
		// Buffered로 전부 바꾸고 StringBuilder에 reverse라는 메서드가 있다는 것을 알게되서 해당 메서드 사용
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		sc.nextLine();
//		for(int i = 0; i < n; i++) {
//			String[] strArr = sc.nextLine().split(" ");
//			for(int j = 0; j < strArr.length; j++) {
//				soluction(strArr[j]);
//				System.out.print(" ");
//			}
//			System.out.println();
//		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());

		for(int i = 0; i < n; i++) {
			String[] strArr = br.readLine().split(" ");
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < strArr.length; j++) {
//				soluction(strArr[j]);
				sb.append(new StringBuilder(strArr[j]).reverse().toString()).append(" ");
			}
			bw.write(sb.toString().trim() + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}