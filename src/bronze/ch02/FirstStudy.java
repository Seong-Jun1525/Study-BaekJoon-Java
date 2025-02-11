package bronze.ch02;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstStudy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if(n < 40) {
				n = 40;
			}
			sum += n;
			arr.add(n);
		}
		
		System.out.println(sum / arr.size());
	}

}
