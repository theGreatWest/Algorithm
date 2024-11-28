package day2_day4_data_structure;

import java.util.Scanner;

public class 백준_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
//        String[] inputs = sc.nextLine().strip().split("");
        char[] chars = sc.nextLine().toCharArray();

        int sum = 0;
//        for (String s : inputs) {
//            sum += Integer.parseInt(s);
//            // sum += Integer.valueOf(s);
//        }
        for (char c : chars) {
            sum += c - '0'; // 캐릭터를 정수형으로 변환하는 법
        }

        System.out.println(sum);
    }
}
