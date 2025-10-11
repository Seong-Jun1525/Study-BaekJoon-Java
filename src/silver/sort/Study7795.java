package silver.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Study7795 {

	private static long count = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		/** 먹을 것인가 먹힐 것인가
		 * 심해에는 두 종류의 생명체 A와 B가 존재한다. A는 B를 먹는다.
		 * A는 자기보다 크기가 작은 먹이만 먹을 수 있다.
		 * 
		 * 예를 들어, A의 크기가 {8, 1, 7, 3, 1}이고,
		 * B의 크기가 {3, 6, 1}인 경우에 A가 B를 먹을 수 있는 쌍의 개수는 7가지가 있다.
		 * 8-3, 8-6, 8-1, 7-3, 7-6, 7-1, 3-1.
		 * 
		 * 두 생명체 A와 B의 크기가 주어졌을 때,
		 * A의 크기가 B보다 큰 쌍이 몇 개나 있는지 구하는 프로그램을 작성하시오.
		 * 
		 * # 입력
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 각 테스트 케이스의 첫째 줄에는 A의 수 N과 B의 수 M이 주어진다.
		 * 둘째 줄에는 A의 크기가 모두 주어지며,
		 * 셋째 줄에는 B의 크기가 모두 주어진다. 크기는 양의 정수이다. (1 ≤ N, M ≤ 20,000) 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		int[] subTestCase = new int[2];
		
		ArrayList<Integer> aNumList = new ArrayList<>();
		ArrayList<Integer> bNumList = new ArrayList<>();
		
		for(int i = 0; i < testCase; i++) {
			// A, B 총 갯수 입력
			String[] subTestCaseStr = (br.readLine()).split(" ");
			subTestCase[0] = Integer.parseInt(subTestCaseStr[0]);
			subTestCase[1] = Integer.parseInt(subTestCaseStr[1]);
			
			// A, B 각각 숫자 리스트
			aNumList = readIntList(br, subTestCase[0]);
			bNumList = readIntList(br, subTestCase[1]);
			
			// 비교
			countPairsBruteForce(aNumList, bNumList);
			System.out.println(count);
			count = 0;
		}
		
	}
	
	private static ArrayList<Integer> readIntList(BufferedReader br, int n) throws IOException {
		ArrayList<Integer> list = new ArrayList<>();
		
		String[] str = (br.readLine()).split(" ");
		
		for(int j = 0; j < n; j++) {
			list.add(Integer.parseInt(str[j]));
		}
		return list;
	}
	
	private static void countPairsBruteForce(ArrayList<Integer> aNumList, ArrayList<Integer> bNumList) {
		aNumList.forEach((value) -> {
			bNumList.forEach((value2) -> {
				if(value > value2) {
					count ++;
				}
			});
		});
	}

}
