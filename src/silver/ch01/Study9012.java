package silver.ch01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Study9012 {

	public static void main(String[] args) {
		// 9012번 괄호
		List<String> parentheses = new ArrayList<String>();
		List<String> result = new ArrayList<String>();
		int checkValue = 0;
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			parentheses.add(str);
		}

//		System.out.println(parentheses.size());
//		System.out.println(parentheses.get(0).length());
		
		for(int i = 0; i < parentheses.size(); i++) {
			for(int j = 0; j < parentheses.get(i).length(); j++) {
//				System.out.println(parentheses.get(i).charAt(j));
				String[] checkArr = parentheses.get(i).split("");
//				System.out.println("checkArr[j] : " + checkArr[j]);
				if(checkArr[j].equals("(")) {
					checkValue += 1;
				}
				else if(checkArr[j].equals(")")) {
					checkValue -= 1;
				}
				
				if(checkValue < 0) {
					break;
				}
			}
//			System.out.println("checkValue : " + checkValue);
			if(checkValue == 0) {
				result.add("YES");
			}
			else {
				result.add("NO");
			}
			checkValue = 0;
		}
		
		for(int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

}
