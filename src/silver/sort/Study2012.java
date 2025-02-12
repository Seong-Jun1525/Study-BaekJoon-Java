package silver.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Study2012 {

	public static void main(String[] args) {
		// 등수 매기기 2012
		Scanner sc = new Scanner(System.in);
		List<Long> list = new ArrayList<>();
		long count = 0;
		long n = sc.nextLong();
		
		for(int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < n; i++) {
			long r = Math.abs((i+1) - list.get(i));
			
			count += r;
		}
		
		System.out.println(count);
	}

}
