package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행렬곱셈2740번 {
    public static void main(String[] args) throws IOException {
        //첫째줄
        //N행 M열
        //그 값
        // M행 K열
        // 그 값

        //곱한다
        //행렬 A       //행렬 B
        //        //-1 -2 0
        //        //0 0 3
        //1 2
        // 3 4
        // 5 6


        //-1 -4 0

        //N개의 줄에 -> 3
        //행렬 A, B를 곱한 행렬을 출력한다.
        //-1  -6

        //행과 열을
        //행렬 A, 행렬B
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        System.out.println("N = " + N);
        System.out.println("M = " + M);

        int[][] A = new int[N][M];

        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }
        StringTokenizer s1 = new StringTokenizer(bufferedReader.readLine());

        int m = Integer.parseInt(s1.nextToken());
        int K = Integer.parseInt(s1.nextToken());

        int[][] B = new int[m][K];

        for (int i = 0; i < m; i++) {
            StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < K; j++) {
                B[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        //행렬 곱해야함
        //A행렬의 행
        //B행렬의 열 을 곱해야함.
        int[][] answer = matrixMult(A, B);
        System.out.println("answer.length = " + answer.length);
        System.out.println("answer[0].length = " + answer[0].length);


        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                stringBuilder.append(answer[i][j]).append(' ');
            }
            stringBuilder.append('\n');

        }
        System.out.print(stringBuilder);


    }

    private static int[][] matrixMult(int[][] a, int[][] b) {

        //행렬의 사이즈를 만들어준다 A행렬 B행렬
        int row = a.length;
        int column = b[0].length;
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                for (int k = 0; k < b.length; k++) {
                    //공통 로직만큼 돈다
                    arr[i][j] += a[i][k] * b[k][j];

                }
                System.out.println(" arr[i][j]  = " + arr[i][j]);


            }
        }
        return arr;
    }
}
