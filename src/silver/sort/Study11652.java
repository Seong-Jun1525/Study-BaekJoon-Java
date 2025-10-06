package silver.sort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Study11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        long[] cards = new long[n];
        for (int i = 0; i < n; i++) {
            cards[i] = Long.parseLong(br.readLine().trim());
        }

        Arrays.sort(cards);

        long bestValue = cards[0];
        int bestCount = 1;

        long currValue = cards[0];
        int currCount = 1;

        for (int i = 1; i < n; i++) {
            if (cards[i] == currValue) {
                currCount++;
            } else {
                if (currCount > bestCount) {
                    bestCount = currCount;
                    bestValue = currValue; // 바뀌기 직전 값으로 갱신
                }
                currValue = cards[i];
                currCount = 1;
            }
        }

        // 마지막 덩어리 반영
        if (currCount > bestCount) {
            bestValue = currValue;
        }

        System.out.println(bestValue);
    }
}
