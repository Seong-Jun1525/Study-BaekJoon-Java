package bronze.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Study2581 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> primeList = new ArrayList<>();
        int sum = 0;

        for(int i = M; i <= N; i++) {
            if(isPrime(i)) {
                primeList.add(i);
                sum += i;
            }
        }

        if(primeList.isEmpty()) {
            bw.write("-1\n");
        } else {
            bw.write(sum + "\n");
            bw.write(primeList.get(0) + "\n"); 
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
