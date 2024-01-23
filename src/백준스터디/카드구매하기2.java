package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 카드구매하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        StringTokenizer input = new StringTokenizer(reader.readLine());
//        System.out.println("N = " + N);
//        System.out.println("input = " + input);
//
//        String[] numbersAsString = input.split(" ");
////        int[] P = new int[numbersAsString.length + 1];
//        int[] P = new int[N + 1];
//        P[0] = 0;
////        for (int i = 0; i < numbersAsString.length; i++) {
////            P[i + 1] = Integer.parseInt(numbersAsString[i]);
////        }
//        for (int i = 0; i < N; i++) {
//            P[i + 1] = Integer.parseInt(numbersAsString[i]);
//        }
//
//
//        int value = 0;
//        int min = 10000;
//        for (int i = 1; i < P.length; i++) {
//            if (N % i == 0) {
//                value = N / i;
//                if (min > P[i] * value) {
//                    min = P[i] * value;
//                }
//
//            } else {
//                // + ;
//            }
//
//        }
//
//        System.out.println("min = " + min);


        int P[] = new int[N + 1];
        int dp[] = new int[N + 1];

        for (int i = 0; i < N; i++) {
            P[i + 1] = Integer.parseInt(input.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            dp[i] = P[i];
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j] + P[j]);
            }
        }
        System.out.println(dp[N]);


    }
}
