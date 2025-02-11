package emerald;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Study1511 {

	public static void main(String[] args) throws IOException {
		// 1511 숫자 만들기 미해결
		/**
		 	1. 공백을 기준으로 0-9 총 10장의 숫자 카드각 각 몇장씩 보유중인지 입력받기
			2. idx[i] * i = 해당 i번째의 숫자 카드 보유 수
			3. cardList에 추가
			4. maxNumList 만들기
			    1. maxNumList가 비었을 경우 
			        1. cardList의 맨 마지막 수를 추가하고 
			    2. 비어있지 않을 경우 
			        1. maxNumList의 맨마지막 수보다 큰값이 있으면 큰 값을 
			        2. 없다면 작은 값 중에 가장 큰 값을 추가
		 *  */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> list = new ArrayList<>();
		List<Integer> mlist = new ArrayList<>();
		
		String[] strArr = br.readLine().split(" ");

		int max = 0;
		
		for(int i = 0; i < 9; i++) {
			if(Integer.parseInt(strArr[i]) != 0) {
				for(int j = 0; j < Integer.parseInt(strArr[i]); j++) {
					list.add(i);
				}
			}
		}
		
		Collections.sort(list, Collections.reverseOrder());

		mlist.add(list.get(0));
		list.remove(0);

		int i = 0;
		
		while(true) {
			if(mlist.get(mlist.size() - 1) != list.get(i)) {
				mlist.add(list.get(i));
				list.remove(i);
				i = 0;
				continue;
			}
			i++;
			if(list.isEmpty()) {
				break;
			}
		}
		
		System.out.println(mlist);
	}

}
