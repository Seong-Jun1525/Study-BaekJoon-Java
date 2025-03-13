package silver.implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Study1417 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 국회의원 선거
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int m = 0;
		int count = 0;
		int max = 0;
		int mIdx = 0;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				m = Integer.parseInt(br.readLine());
			} else {
				list.add(Integer.parseInt(br.readLine()));
			}
		}
		
		Collections.sort(list, Collections.reverseOrder());
		max = list.get(0);
		int i = 0;
		
		if(list.size() > 1) {
			while(true) {
				if(m <= max) {
					m++;
					list.set(i, list.get(i) - 1);
					count++;
					
					if(m == max) break;
					
					if(list.get(i) > max) {
						mIdx = i;
					}
					
					if(max != list.get(mIdx)) {
						max = list.get(mIdx);
					}
				} else break;
                
				if(i + 1 < list.size()) i++;
				else i = 0;
			}
		}
		
		bw.write(count + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
