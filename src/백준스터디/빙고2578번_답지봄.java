package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 빙고2578번_답지봄 {
    static int[][] board = new int[5][5];

    static int countBingo = 0;
    static int countNumberOrder = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 5; i++) {

            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());


            }
        }


        for (int i = 0; i < 5; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < 5; j++) {
                int N = Integer.parseInt(stringTokenizer.nextToken());
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (board[k][l] == N) {
                            board[k][l] = 0;


                        }
                    }
                }

                col();
                row();
                diag1();
                diag2();

                if (countBingo >= 3) {
                    System.out.println(countNumberOrder);
                    System.exit(0);
                }

                countBingo = 0;
                countNumberOrder++;


            }
        }


    }


    public static void col() {
        for (int i = 0; i < 5; i++) {

            int count = 0;
            for (int j = 0; j < 5; j++) {
                if (board[j][i] == 0) {
                    count++;
                    if (count == 5) {
                        countBingo++;
                    }
                }
            }

        }


    }


    private static void row() {

        for (int i = 0; i < 5; i++) {

            int count = 0;
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == 0) {
                    count++;
                    if (count == 5) {
                        countBingo++;
                    }
                }
            }

        }

    }


    private static void diag1() {
        //
        int count = 0;
        for (int i = 0; i < 5; i++) {

            if (board[i][i] == 0) {
                count++;
                if (count == 5) {
                    countBingo++;
                }
            }
        }
    }

//    private static void diag2() {
//        for (int i = 4; i >= 0; i--) {
//            int count = 0;
//            for (int j = 0; j < 5; j++) {
//                if (board[i][j] == 0) {
//                    count++;
//                    if (count == 5) {
//                        countBingo++;
//                    }
//                }
//            }
//
//        }
//    }

    private static void diag2() {
        int count = 0;

        for (int i = 0; i < 5; i++) {
            if (board[i][4 - i] == 0) {
                count++;
                if (count == 5) {
                    countBingo++;
                }
            }
        }


    }


}
