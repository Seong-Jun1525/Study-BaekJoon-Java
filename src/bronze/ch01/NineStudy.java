package bronze.ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NineStudy {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> list = new ArrayList<>();
		String[] str = br.readLine().split(" ");
		
		for(int i = 0; i < str.length; i++) {
			list.add(Integer.parseInt(str[i]));
		}
		
		Collections.sort(list);
		
		bw.write(list.get(1) + "");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
