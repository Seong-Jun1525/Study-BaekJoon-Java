package silver.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Study1431 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/** 시리얼 번호
		 * 1. A와 B의 길이가 다르면, 짧은 것이 먼저 온다.
		 * 2. 만약 서로 길이가 같다면,
		 * 		A의 모든 자리수의 합과 B의 모든 자리수의 합을 비교해서 작은 합을 가지는 것이 먼저온다.
		 * 		(숫자인 것만 더한다)
		 * 3. 만약 1,2번 둘 조건으로도 비교할 수 없으면, 사전순으로 비교한다.
		 *      숫자가 알파벳보다 사전순으로 작다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strArr = new String[n];
		
		for(int i = 0; i < n; i++) {
			strArr[i] = br.readLine();
		}

		Arrays.sort(strArr, (a, b) -> {
		    // 1)
			int compareLen = Integer.compare(a.length(), b.length());
			if(compareLen != 0) return compareLen;
			
		    // 2)
		    int sdA = sumDigits(a);
		    int sdB = sumDigits(b);
		    int compareSumDigits = Integer.compare(sdA, sdB);
		    if(compareSumDigits != 0) return compareSumDigits;
		    
			// 3)
		    return a.compareTo(b);
		});

		for(int i = 0; i < n; i++) System.out.println(strArr[i]);

	}
	
	private static int sumDigits(String str) {
		// 문자열 중 숫자만 더한 값 반환
		int sum = 0;

		for (char ch : str.toCharArray()) {
		    if (Character.isDigit(ch)) {
		    	sum += ch - '0';
		    }
		}
		
		return sum;
	}

}
