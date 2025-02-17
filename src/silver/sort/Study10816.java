package silver.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Study10816 {

	public static void main(String[] args) throws IOException {
		// 숫자 카드 2
		/**
		 * getOrDefault(key, defaultValue) 메서드
		 * - 자바의 HashMap에서 특정 키에 대한 값이 존재하는지 확인하고, 없을 경우 기본값을 반환하는 메서드
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(stk.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1); // 등장 횟수 저장
        }

        int m = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int query = Integer.parseInt(stk.nextToken());
            sb.append(map.getOrDefault(query, 0)).append(" "); // 존재하지 않으면 0 출력
        }

        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
	}

}
