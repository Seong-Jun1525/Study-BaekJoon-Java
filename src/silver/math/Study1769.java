package silver.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study1769 {

    public static void main(String[] args) throws IOException {
    	// 3의 배수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String x = br.readLine();
        int count = 0;

        while (x.length() > 1) {
            x = String.valueOf(method(x));
            count++;
        }

        System.out.println(count);
        System.out.println(Integer.parseInt(x) % 3 == 0 ? "YES" : "NO");
    }

    public static int method(String n) {
        int sum = 0;
        for (char c : n.toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }
}
