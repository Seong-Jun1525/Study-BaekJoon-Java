package silver.ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Study1026 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1026번 보물
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		boolean flag = false;
		int sum = 0;

		List<Integer> arr1 = new ArrayList<>();
		List<Integer> arr2 = new ArrayList<>();
		
		for(int i = 0; i < 2; i++) {
			String str = br.readLine();
			String[] strArr = str.split(" ");
			
			for(int j = 0; j < n; j++) {
				if(!flag) {
					arr1.add(Integer.parseInt(strArr[j]));
				}
				else {
					arr2.add(Integer.parseInt(strArr[j]));
				}
			}
			flag = true;
		}
		
//		System.out.println(arr1);
//		System.out.println(arr2);
		
		Collections.sort(arr1);
		Collections.sort(arr2, Collections.reverseOrder());

//		System.out.println(arr1);
//		System.out.println(arr2);
		
		for(int i = 0; i < n; i++) {
			sum += arr1.get(i) * arr2.get(i);
		}
		
		bw.write(sum + "");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
