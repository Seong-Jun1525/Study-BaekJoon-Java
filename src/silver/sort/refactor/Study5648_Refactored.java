package silver.sort.refactor;

import java.io.*;
import java.util.Arrays;

public class Study5648_Refactored {

    // 초고속 입력 전용 스캐너
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream is) {
            this.in = is;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        // 공백(<= ' ') 기준으로 토큰을 하나 반환
        String next() throws IOException {
            StringBuilder sb = new StringBuilder();
            int c;
            // skip whitespace
            while (true) {
                c = read();
                if (c == -1) return null;
                if (c > ' ') break;
            }
            // read token
            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }
            return sb.toString();
        }

        int nextInt() throws IOException {
            String s = next();
            if (s == null) throw new EOFException("Unexpected EOF for int");
            return Integer.parseInt(s);
        }
    }

    // s를 뒤에서 앞으로 보며 리버스 + 선행 0 제거 (전부 0이면 "0")
    static String reverseStripLeadingZeros(String s) {
        char[] a = s.toCharArray();
        int i = a.length - 1;

        // 뒤집었을 때 앞자리가 될 부분의 '0'들을 스킵 (원문 기준 뒤쪽의 0)
        while (i >= 0 && a[i] == '0') i--;

        if (i < 0) return "0"; // 모두 0

        StringBuilder sb = new StringBuilder(i + 1);
        for (int j = i; j >= 0; j--) {
            sb.append(a[j]);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        // 1) N 읽기
        int n = fs.nextInt();
        long[] arr = new long[n];

        // 2) N개의 수 처리
        for (int i = 0; i < n; i++) {
            String num = fs.next();           // 숫자를 문자열로 읽음
            String rev = reverseStripLeadingZeros(num); // 뒤집고 선행0 제거
            // 빈 문자열 방어 (논리상 나오지 않지만 안전 차원)
            if (rev.isEmpty()) rev = "0";

            // 문제 범위가 long에 들어온다는 전제 하에 파싱
            // 범위가 불확실하면 BigInteger로 교체 가능
            arr[i] = Long.parseLong(rev);
        }

        // 3) 정렬
        Arrays.sort(arr);

        // 4) 배치 출력
        StringBuilder out = new StringBuilder(n * 12); // 대략적인 capacity
        for (int i = 0; i < n; i++) {
            out.append(arr[i]).append('\n');
        }
        System.out.print(out);
    }
}