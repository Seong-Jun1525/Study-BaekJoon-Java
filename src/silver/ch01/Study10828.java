package silver.ch01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Study10828 {

	public static void main(String[] args) {
		// 10828 스택
		Scanner sc = new Scanner(System.in);
		List<String> orders = new ArrayList<String>();
		List<Integer> result = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		sc.nextLine(); // 버퍼 비우기
		
		for(int i = 0; i < n; i++) {
			orders.add(sc.nextLine());
		}
		
		for(String order : orders) {
			if(order.startsWith("push")) {
				String[] parts = order.split(" ");
				if(parts.length == 2) {
					int num = Integer.parseInt(parts[1]);
					result.add(num);
				}
			}
			
			else if(order.startsWith("pop")) {
				if(result.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(result.get(result.size() - 1));
					result.remove(result.size() - 1);
				}
			}
			else if(order.startsWith("size")) {
				System.out.println(result.size());
			}
			else if(order.startsWith("empty")) {
				System.out.println(result.isEmpty() ? 1 : 0);
			}
			else if(order.startsWith("top")) {
				if(result.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(result.get(result.size() - 1));
				}
			}
		}
	}
}
