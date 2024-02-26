package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 가장긴감소하는부분수열11722 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        StringTokenizer input = new StringTokenizer(reader.readLine());
        int A[] = new int[N + 1];
        int dp[] = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            A[i] = Integer.parseInt(input.nextToken());
            System.out.println("A[i ] = " + A[i]);

        }
        int result = 0;


        for (int i = 1; i <= N; i++) {
            dp[i] = 1;
            for (int j = 1; j < i; j++) {
                if (A[j] > A[i]) {
                    dp[i] = Math.max(dp[i], dp[i] + 1);
                }
            }
            result = Math.max(result, dp[i]);

        }

        System.out.println("result = " + result);


//        for (int i = 1; i <= N; i++)
//            System.out.println("dp[i] = " + dp[i]);

// 포인터로 풀려고 함..
//        int max = 0;
//        int answer = 0;
//
//        int i = 0;
//        int j = 0;
//
//        while (i <= i && j < N) {
//            if (A[i] < A[j]) {
//                i++;
//
//            } else if (A[i] == A[j]) {
//                j++;
//
//            } else if (A[i] > A[j]) {
//                answer = j - i;
//                if (max <= answer) {
//                    max = answer;
//                    System.out.println("max = " + max);
//                    System.out.println("A = " + A[j]);
//                    System.out.println("A+1 = " + A[j + 1]);
//
//
//                    if (A[j] >= A[j + 1]) {
//                        System.out.println("j?? = " + j);
//                        j++;
//                        answer = j - i;
//                        if (max < answer) {
//                            max = answer;
//                        }
//                        System.out.println("j/// = " + j);
//
//                    } else if (A[i] < A[j + 1]) {
//                        i++;
//                        System.out.println("i //= " + i);
//
//                    }
//
//                }
//
//                System.out.println("i = " + i);
//                System.out.println("j = " + j);
//
//            }
//
//        }
//        System.out.println("answer = " + answer);

    }


}
