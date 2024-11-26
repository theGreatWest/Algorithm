package day1_debugging;

import java.util.Scanner;

public class Debugging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        int[] A = new int[100001];
        int[] B = new int[100001];

        for (int i = 1; i < 10000; i++) {
            A[i] = (int) (Math.random() * Integer.MAX_VALUE);
            B[i] = B[i - 1] + A[i];
        }

        for (int t = 1; t < testCase; t++) {
            int answer = 0;
            for (int i = 0; i < 10; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                answer += B[end] - B[start - 1];
                System.out.println(testCase + " " + answer);
            }
        }

    }
}
