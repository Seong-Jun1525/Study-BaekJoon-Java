package silver.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Study2910 {

	public static void main(String[] args) throws IOException {
		/** 빈도 정렬
		 * 첫째 줄에 메시지의 길이 N과 C가 주어진다. (1 ≤ N ≤ 1,000, 1 ≤ C ≤ 1,000,000,000)
		 * 둘째 줄에 메시지 수열이 주어진다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N: 메시지 길이, C: 값의 최대
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        // LinkedHashMap : 순서 o
        LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();

        int read = 0;
        while (read < N) {
            if (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
                continue;
            }
            int x = Integer.parseInt(st.nextToken());
            freq.put(x, freq.getOrDefault(x, 0) + 1);
            read++;
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> e : list) {
            int val = e.getKey();
            int cnt = e.getValue();
            for (int i = 0; i < cnt; i++) sb.append(val).append(' ');
        }
        System.out.println(sb.toString().trim());
	}

}
