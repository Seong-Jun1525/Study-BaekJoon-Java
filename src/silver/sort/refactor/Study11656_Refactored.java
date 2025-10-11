package silver.sort.refactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Study11656_Refactored {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String word = br.readLine();
        int len = word.length();

        // 접미사 배열 생성 (O(n))
        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            arr[i] = word.substring(i);
        }

        // 사전순 정렬 (O(n log n) * 비교비용)
        Arrays.sort(arr);

        // 한 번에 출력
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s).append('\n');
        }
        System.out.print(sb);
	}

}
