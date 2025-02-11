package bronze.ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FirstStudy {
	
	public static int soluction(int n) {
		int r = 1;
		for(int i = 1; i < n+1; i++) {
			r = r * i;
		}
		return r;
	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		bw.write(soluction(n) + "");
		bw.flush();
		bw.close();
		br.close();
	}
}
