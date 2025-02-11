package silver.ch01;

import java.util.HashSet;
import java.util.Scanner;

public class SecondStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> arrSet = new HashSet<>(); 
        StringBuilder result = new StringBuilder();
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arrSet.add(sc.nextInt());
        }
        
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int value = sc.nextInt();
            if (arrSet.contains(value)) {
                result.append("1\n");
            } else {
                result.append("0\n");
            }
        }
        
        System.out.print(result);
    }
}