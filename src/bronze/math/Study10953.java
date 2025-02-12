package bronze.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Study10953 {

	public static void main(String[] args) throws IOException {
		// 10953 a + b 6번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());

		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(",");
			list.add((Integer.parseInt(str[0]) + Integer.parseInt(str[1])));
		}
		
		for(int a : list) {
			bw.write(a + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
