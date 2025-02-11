package silver.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Study1181 {

	public static void main(String[] args) {
		// 단어정렬
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		Set<String> setArr = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			setArr.add(sc.nextLine());
		}
		
		ArrayList<String> keySet = new ArrayList<>(setArr);
		
		keySet.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
		
//		System.out.println("==============");
		for(int i = 0; i < keySet.size(); i++) {
			System.out.println(keySet.get(i));
		}
		
		sc.close();
	}

}
