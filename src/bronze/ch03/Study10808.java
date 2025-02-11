package bronze.ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Study10808 {

	public static void main(String[] args) throws IOException {
		// 10808 알파벳 개수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[26];
		
		// 알파벳
		char[] alpha = {
				'a', 'b', 'c', 'd', 'e',
				'f', 'g' ,'h', 'i', 'j',
				'k', 'l', 'm', 'n', 'o',
				'p', 'q', 'r', 's', 't',
				'u', 'v', 'w', 'x', 'y', 'z'};
		
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			for(int j = 0; j < alpha.length; j++) {
				if(c == alpha[j]) {
					arr[j] += 1;
				}
			}
		}
		
		for(int a : arr) {
			bw.write(a + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}

}
