package bronze.ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FourStudy {
	
	public static String strfry(String str) {
		String[] strArr = str.split(" ");
		
		if(strArr[0].length() != strArr[1].length()) {
			return "Impossible";
		}
		
		int[] str1 = new int[26];
		int[] str2 = new int[26];
		
		for(int i = 0; i < strArr[0].length(); i++) {
			// 아스키코드 값 사용
			str1[strArr[0].charAt(i) - 'a']++;
			str2[strArr[1].charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < str1.length; i++) {
			if(str1[i] != str2[i]) {
				return "Impossible";
			}
		}
		
		return "Possible";
	}

	public static void main(String[] args) throws IOException {
		// 11328 Strfry
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String result = "";
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			
			result = strfry(str);
			
			bw.write(result + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
