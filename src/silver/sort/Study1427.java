package silver.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Study1427 {

	public static void main(String[] args) throws IOException {
		// 1427 소트인사이드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> l = new ArrayList<>();
		
		String str = br.readLine();
		String[] strArr = str.split("");
		
		for(int i = 0; i < strArr.length; i++) {
			l.add(Integer.parseInt(strArr[i]));
		}

		Collections.sort(l, Collections.reverseOrder());
		
		for(int a : l) {
			bw.write(a + "");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
