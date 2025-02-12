package bronze.ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class SecondStudy {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<String> list = new ArrayList<>();
		int count = 0;

		for(int i = 0; i < 3; i++) {
			String[] str = br.readLine().split(" ");

			for(int j = 0; j < 4; j++) {
				if(Integer.parseInt(str[j]) == 1) {
					count++;
				}
			}

			switch(count) {
				case 0:
					list.add("D");
					break;
				case 1:
					list.add("C");
					break;
				case 2:
					list.add("B");
					break;
				case 3:
					list.add("A");
					break;
				case 4:
					list.add("E");
					break;
			}
			
			count = 0;
		}
		
		for(String s : list) {
			bw.write(s + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
