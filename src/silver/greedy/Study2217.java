package silver.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Study2217 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 로프 2217
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> arr = new ArrayList<>();
		
		int k = Integer.parseInt(br.readLine()); // 로프의 갯수
		
		for(int i = 0; i < k; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arr, Collections.reverseOrder()); // 내림차순 정렬

		int max = 0;
		
		for(int i = 0; i < arr.size(); i++) {
			if(max < (arr.get(i) * (i + 1))) max = arr.get(i) * (i + 1);
		}
		
		bw.write(max + "");
		bw.flush();
		bw.close();
		br.close();
	}

}

/*
### 문제 이해 및 정리

#### **문제 개요**
- N개의 로프가 있으며, 각각의 로프는 특정한 최대 중량을 버틸 수 있다.
- 여러 개의 로프를 병렬로 사용하면, 무게가 로프 개수만큼 나뉘어 걸린다.
- 모든 로프를 사용할 필요는 없으며, 최적의 로프 조합을 찾아 최대 중량을 들어 올려야 한다.

#### **핵심 조건**
1. **로프는 병렬로 연결할 수 있다.**  
   → 여러 개의 로프를 함께 사용하면 무게가 균등하게 분배됨.
2. **각각의 로프는 특정 중량을 버틸 수 있다.**  
   → 어떤 로프는 더 강하고, 어떤 로프는 더 약할 수 있음.
3. **로프 개수와 내구도를 고려하여 최대로 들 수 있는 중량을 찾아야 한다.**  
   → 최적의 로프 조합을 찾아야 함.

#### **접근 방법**
- **로프의 내구도를 내림차순 정렬**  
  → 강한 로프부터 차례로 사용하면 최대 중량을 쉽게 구할 수 있음.
- **k개의 로프를 사용하면, 가장 약한 로프가 기준이 됨**  
  → k번째로 강한 로프의 내구도 × k가 가능한 최대 중량.

#### **예제 분석**
예를 들어, 다음과 같은 로프들이 있다고 가정하자.

| 로프 내구도 | 10 | 15 | 20 | 25 |
|------------|----|----|----|----|
| 사용 개수  | 1  | 2  | 3  | 4  |

- 하나만 사용하면 25kg까지 가능.
- 두 개를 사용하면 가장 약한 로프(20kg)가 기준이 되어 2 × 20 = 40kg 가능.
- 세 개를 사용하면 가장 약한 로프(15kg)가 기준이 되어 3 × 15 = 45kg 가능.
- 네 개를 모두 사용하면 가장 약한 로프(10kg)가 기준이 되어 4 × 10 = 40kg 가능.

→ **결과적으로 최대 중량은 45kg.**  

#### **결론**
- **로프를 내림차순 정렬**
- **최적의 k개 선택**
- **(k번째 로프의 내구도) × k 값을 구하고 최대값 갱신**  
→ **그리디 알고리즘을 활용한 최적해 탐색 문제**.
*/
