package silver.bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Study1543 {

	public static void main(String[] args) throws IOException {
		// 문서 검색
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String result = str1;
		
		int idx = 0;
		int count = 0;
		for(int i = 0; i < str1.length(); i++) {
			if(result.indexOf(str2) != -1) {
				idx += result.indexOf(str2) + (str2.length() - 1);
				result = result.substring(idx + 1);
				count++;
			} else break;
			idx = 0;
		}
		
		bw.write(count + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
