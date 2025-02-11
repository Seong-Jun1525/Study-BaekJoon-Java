package silver.ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SevenStudy {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		for(int i = a; i <= b; i++) {
			if(i == 0 || i == 1) {
				continue;
			}
			else if(isPrime(i)) {
				sb.append(i + "\n");
			}
		}
		
		bw.write(sb + "");
		
		bw.flush();
		bw.close();
		br.close();
	}

	public static boolean isPrime(int n) {
		for(int i = 2; i <= (int)Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
