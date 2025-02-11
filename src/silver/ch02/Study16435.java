package silver.ch02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Study16435 {

	public static void main(String[] args) {
		// 16435 스네이크버드
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		ArrayList<Integer> intArr = new ArrayList<>();
		
		int n = Integer.parseInt(strArr[0]);
		int len = Integer.parseInt(strArr[1]);
		
		str = sc.nextLine();
		strArr = str.split(" ");
		
		for(int i = 0; i < n; i++) {
			intArr.add(Integer.parseInt(strArr[i]));
		}
		
		Collections.sort(intArr);
		
		for(int i = 0; i < n; i++) {
			if(intArr.get(i) <= len) {
				len += 1;
			}
		}

		System.out.println(len);
	}

}
