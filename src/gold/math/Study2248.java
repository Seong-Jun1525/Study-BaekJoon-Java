package gold.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Study2248 {

	public static void main(String[] args) throws IOException {
		// 이진수 찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 이 방법을 사용하면 메모리가 터진다 그리고 인덱스 접근 방법도 잘못되었다.
		String[] strArr = br.readLine().split(" ");
		
		ArrayList<String> arr = new ArrayList<>();
		
		long n = Long.parseLong(strArr[0]); // 자리
		long l = Long.parseLong(strArr[1]); // 1인 비트 개수
		long i = Long.parseLong(strArr[2]); // 출력할 이진수
		
//		System.out.println(Long.toBinaryString((long)(Math.pow(n, 2))));
		
		long max = (long)(Math.pow(2, n));
		
		for(long j = 0; j < max; j++) {
			String str = Long.toBinaryString(j);
			if(checkL(str) <= l) {
				str = n - str.length() > 0 ? "0".repeat((int)(n-str.length())) + str : str;
				arr.add(str);
			}
		}
		
//		for(String s : arr) System.out.println(s);
		
		bw.write(arr.get((int) (i - 1)) + "");
		
		bw.flush();
		bw.close();
		br.close();
	}

	private static int checkL(String str) {
		char[] cArr = str.toCharArray();
		int count = 0;
		for(int i = 0; i < cArr.length; i++) {
			if(cArr[i] == '1') count++;
		}
		
		return count;
	}

}
