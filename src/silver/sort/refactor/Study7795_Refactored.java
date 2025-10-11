package silver.sort.refactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Study7795_Refactored {
	public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = fs.nextInt();
        while (T-- > 0) {
            int N = fs.nextInt();
            int M = fs.nextInt();

            int[] A = new int[N];
            int[] B = new int[M];

            for (int i = 0; i < N; i++) A[i] = fs.nextInt();
            for (int i = 0; i < M; i++) B[i] = fs.nextInt();

            Arrays.sort(A);
            Arrays.sort(B);

            long count = countPairsTwoPointer(A, B);
            sb.append(count).append('\n');
        }
        System.out.print(sb);
    }

    // A[i] > B[j] 인 (i, j) 쌍의 개수
    private static long countPairsTwoPointer(int[] A, int[] B) {
        int j = 0;
        long count = 0;
        for (int a : A) {
            while (j < B.length && B[j] < a) j++; // B 중 a보다 작은 개수
            count += j;
        }
        return count;
    }

    // 빠른 입력
    private static class FastScanner {
        private final BufferedReader br;
        private StringTokenizer stk;

        FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }
        
        String next() throws IOException {
            while (stk == null || !stk.hasMoreTokens()) {
            	stk = new StringTokenizer(br.readLine());
            }
            return stk.nextToken();
        }
        
        int nextInt() throws IOException { 
        	return Integer.parseInt(next()); 
        }
    }
}
