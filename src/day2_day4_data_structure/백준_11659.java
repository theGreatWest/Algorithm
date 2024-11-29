package day2_day4_data_structure;

import java.util.Scanner;

import java.io.*;

public class 백준_11659 {
    // i ~ j 까지의 합(누적 합)을 구하는 문제
    // 구간마다 합을 구해야 하는 문제에 사용

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

//        StringTokenizer, BufferedReader, InputStreamReader 사용법
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//
//        while(st.hasMoreTokens()){ // 값이 있으면 true, 없으면 false 반환
//            st = new StringTokenizer(문자열, 구분자, true/false) // true: 구분자도 token 포함 / false: 구분자는 token 포합 X
//        }

        int[] s = new int[n];
        s[0] = sc.nextInt();
        for(int i=1;i<n;i++){
            s[i] = s[i-1] + sc.nextInt();
        }

        for(int t=0;t<m;t++){
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;

            if(i==0) System.out.println(s[j]);
            else System.out.println(s[j] - s[i-1]);
        }
    }
}
