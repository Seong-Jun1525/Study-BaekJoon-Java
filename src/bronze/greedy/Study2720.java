package bronze.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Study2720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 세탁소 사장 동혁 2720
		/**
		 * 예제는 다 정답이고 로직도 틀린게 없다고 생각했지만 계속 틀렸다..
		 * 
		 * # 이유
		 * 센트가 소수로 되어있어서 double 형을 사용했다
		 * 하지만 실수형으로 나누기 연산을 하면
		 * 부동소수점 때문에 원하지 않은 결과를 얻게 된다..
		 * 그러므로 정수형으로 계산하는 것으로 수정하였다
		 * 
		 * 반례
		 * 1
		 * 430
		 */
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스
		
		for(int i = 0; i < t; i++) {
			// 테스트케이스만큼 받은 돈 입력받기
			int money = Integer.parseInt(br.readLine());

			if(money > 0) {
				if(money >= 25) {
					sb.append(money / 25 + " ");
					money %= 25;
				} else sb.append(0 + " ");
				
				if(money >= 10) {
					sb.append(money / 10 + " ");
					money %= 10;
				} else sb.append(0 + " ");
				
				if(money >= 5) {
					sb.append(money / 5 + " ");
					money %= 5;
				} else sb.append(0 + " ");
				
				if(money >= 1) {
					sb.append(money / 1 + " ");
					money %= 1;
				} else sb.append(0 + " ");

				sb.append("\n");
			}
		}
		
		
		bw.write(sb + "");
		bw.flush();
		bw.close();
		br.close();
	}

}




//double money = Double.parseDouble(br.readLine());
//money *= 0.01;
//if(money > 0) {
//	if(money >= 0.25) {
//		sb.append((int)(Math.floor(money / 0.25)) + " ");
//		money = Math.round((money % 0.25) / 100.0);
//	} else {
//		sb.append(0 + " ");
//	}
//	System.out.println(money);
//	
//	if(money >= 0.1) {
//		sb.append((int)(Math.floor(money / 0.1)) + " ");
//		money = Math.round((money % 0.1) / 100.0);
//	} else {
//		sb.append(0 + " ");
//	}
//	System.out.println(money);
//	
//	if(money >= 0.05) {
//		sb.append((int)(Math.floor(money / 0.05)) + " ");
//		money = Math.round((money % 0.05) / 100.0);
//	} else {
//		sb.append(0 + " ");
//	}
//	System.out.println(money);
//	
//	if(money >= 0.01) {
//		sb.append((int)(Math.floor(money / 0.01)) + " ");
//		money = Math.round((money % 0.01) / 100.0);
//	} else {
//		sb.append(0 + " ");
//	}
//	System.out.println(money);
//
//	sb.append("\n");
//}
