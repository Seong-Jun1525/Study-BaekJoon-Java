package silver.ch01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Study4949 {

	public static void main(String[] args) {
		// 4949 균형잡힌 세상
//		Scanner sc = new Scanner(System.in);
//		ArrayList<String> strArr = new ArrayList<String>();
//		ArrayList<String> stack = new ArrayList<String>();
//		
//		while(true) {
//			String str = sc.nextLine();
////			System.out.println("str : " + str);
//			if(str.equals(".")) {
//				break;
//			}
//			else {
//				strArr.add(str);
//			}
//		}
//		
//		for(int i = 0; i < strArr.size(); i++) {
////			System.out.println(strArr.get(i));
//			String[] str = strArr.get(i).split("");
//			for(int j = 0; j < str.length; j++) {
//				if(str[j].equals("(") || str[j].equals("[")) {
//					stack.add(str[j]);
//				}
//				else if(str[j].equals(")")) {
//					if(stack.size() > 0 && stack.get(stack.size() - 1).equals("(")) {
//						stack.remove(stack.size() - 1);
//					}
//					else if(stack.size() == 0) {
//						stack.add(str[j]);
//					}
////					else {
////						System.out.println("NO");
////					}
//				}
//				else if(str[j].equals("]")) {
//					if(stack.size() > 0 && stack.get(stack.size() - 1).equals("[")) {
//						stack.remove(stack.size() - 1);
//					}
//					else if(stack.size() == 0) {
//						stack.add(str[j]);
//					}
////					else {
////						System.out.println("NO");
////					}
//				}
//			}
//			if(stack.size() == 0) {
//				System.out.println("YES");
//			}
//			else {
//				System.out.println("NO");
//			}
//
//			stack.clear();
//		}
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		ArrayList<String> resultArr = new ArrayList<String>();
		
		while(true) {
			str = sc.nextLine();
			
			if(str.equals(".")) break;
			
			resultArr.add(soluction(str));
		}
		
		for(int i = 0; i < resultArr.size(); i++) {
			System.out.println(resultArr.get(i));
		}
	}
	
	public static String soluction(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '(' || c == '[') {
				stack.push(c);
			}
			else if(c == ')') {
				if(stack.empty() || stack.peek() != '(') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			else if(c == ']') {
				if(stack.empty() || stack.peek() != '[') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
		}
		
		if(stack.empty()) {
			return "yes";
		}
		else {
			return "no";
		}
	}
}