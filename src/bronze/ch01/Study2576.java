package bronze.ch01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Study2576 {

	public static void main(String[] args) {
		// 거스름돈 2576
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<>();
		
		int sum = 0;
		
		for(int i = 0; i < 7; i++) {
			int n = sc.nextInt();
			
			if(n % 2 != 0) {
				l.add(n);
			}
		}
		
		if(!l.isEmpty()) {
			int min = l.get(0);
			
			for(int a : l) {
				sum += a;
				if(a < min) min = a;
			}

			System.out.println(sum);
			System.out.println(min);
		}
		else System.out.println(-1);
	}

}
