package bronze.math;

import java.util.Scanner;

public class Study1546 {

	public static void main(String[] args) {
		// 1546 평균 구하기
//		int subjectCount, subjectScore;
//		double max = 0;
//		double total = 0;
//		double average;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		subjectCount = sc.nextInt();
//		
//		double arr[] = new double[subjectCount];
//		
//		for(int i = 0; i < subjectCount; i++) {
//			subjectScore = sc.nextInt();
//			arr[i] = subjectScore;
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		for(int i = 0; i < subjectCount; i++) {
//			total += arr[i] / max * 100;
//		}
//		average = total / subjectCount;
//		System.out.println(average);
		Scanner sc = new Scanner(System.in);
        int subjectCount = sc.nextInt();
        double max = 0, total = 0;
        
        for (int i = 0; i < subjectCount; i++) {
            double score = sc.nextInt();
            if (score > max) max = score;
            total += score;
        }
        
        double average = (total / max * 100) / subjectCount;
        System.out.println(average);
	}

}
