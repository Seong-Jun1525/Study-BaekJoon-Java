package gold.dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Study12865 {

	public static void main(String[] args) throws IOException {
		// 평범한 배낭
		
		/* 이 문제는 아주 평범한 배낭에 관한 문제이다.
		 * 
		 * 한 달 후면 국가의 부름을 받게 되는 준서는 여행을 가려고 한다.
		 * 세상과의 단절을 슬퍼하며 최대한 즐기기 위한 여행이기 때문에, 가지고 다닐 배낭 또한 최대한 가치 있게 싸려고 한다.
		 * 
		 * 준서가 여행에 필요하다고 생각하는 N개의 물건이 있다. 각 물건은 무게 W와 가치 V를 가지는데,
		 * 해당 물건을 배낭에 넣어서 가면 준서가 V만큼 즐길 수 있다.
		 * 아직 행군을 해본 적이 없는 준서는 최대 K만큼의 무게만을 넣을 수 있는 배낭만 들고 다닐 수 있다.
		 * 준서가 최대한 즐거운 여행을 하기 위해 배낭에 넣을 수 있는 물건들의 가치의 최댓값을 알려주자.
		 * 
		 * 입력
		 * 첫 줄에 물품의 수 N(1 ≤ N ≤ 100)과 준서가 버틸 수 있는 무게 K(1 ≤ K ≤ 100,000)가 주어진다.
		 * 두 번째 줄부터 N개의 줄에 거쳐 각 물건의 무게 W(1 ≤ W ≤ 100,000)와 해당 물건의 가치 V(0 ≤ V ≤ 1,000)가 주어진다.
		 * 
		 * 입력으로 주어지는 모든 수는 정수이다.
		 * 
		 * 출력
		 * 한 줄에 배낭에 넣을 수 있는 물건들의 가치합의 최댓값을 출력한다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]); // 반복횟수
		int k = Integer.parseInt(input[1]); // 버틸 수 있는 무게
		int value = 0;
		int kg = 0;

		int[] dp = new int[k+1];
		
		for(int i = 0; i < n; i++) {
			String[] wv = br.readLine().split(" ");
			int w_i = Integer.parseInt(wv[0]);
			int v_i = Integer.parseInt(wv[1]);
			
//			if(kg + Integer.parseInt(wv[0]) > k) {
//				arr.add(value);
//				kg = Integer.parseInt(wv[0]);
//				value = Integer.parseInt(wv[1]);
//			} else {
//				kg += Integer.parseInt(wv[0]);
//				value += Integer.parseInt(wv[1]);
//			}
			
			for (int w = k; w >= w_i; w--) { // 큰 값부터 진행
			    dp[w] = Math.max(dp[w], dp[w - w_i] + v_i);
			}
		}
		
		bw.write(dp[dp.length - 1] + "\n");
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
