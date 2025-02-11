package bronze.implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class Study10797 {

	public static void main(String[] args) {
		// 10797번 10부제
		int value;
		int count = 0;
		ArrayList arr = new ArrayList();

		Scanner sc = new Scanner(System.in);
		
		value = sc.nextInt();
		
		for(int i = 0; i < 5; i++) {
			arr.add(sc.nextInt());
		}
		
		for(int i = 0; i < 5; i++) {
			if((int) (arr.get(i)) == value) {
				count++;
			}
		}
	
		System.out.println(count);
	}
}