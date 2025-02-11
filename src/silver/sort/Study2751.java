package silver.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Study2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 2751 수 정렬하기2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arrL = new int[n];
		
		for(int i = 0; i < n; i++) {
			arrL[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arrL);
		
		for(int i = 0; i < n; i++) {
			bw.write(arrL[i] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
