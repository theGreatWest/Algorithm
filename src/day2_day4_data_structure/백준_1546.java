package day2_day4_data_structure;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] scores = new int[n];
        for(int i=0;i<n;i++){
            scores[i] = sc.nextInt();
        }

        Arrays.sort(scores);
        int m = scores[n-1];

        double sum = 0;
        for(int i=0;i<n;i++){
            sum += (double)scores[i]/m * 100;
        }

        System.out.println(sum/n);
    }
}
