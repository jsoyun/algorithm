package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 병든나이트1783번 {
    static boolean[][] board;
    static int answer = 1;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {

        //체스판의 세로 길이 N 가로길이 M
        //100 50
        //병든 나이트가 여행에서 방문할 수 있는 칸의 개수 중 최대값 출력
        //시작: 가장 맨 왼쪽 아래칸!
        //(100,0)칸

        //보드를 만들어 놓고
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(s1);
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());

        board = new boolean[N][M];
        //시작점에서 출발! -> 맨처음 한개부터 시작음

        board[N - 1][0] = true;
        //1,2,3,4 방법으로 보드내에서 돌기

        int i = N - 1;
        int j = 0;
        check1(i, j);

        //시작점에서 시작해서 조회하는 경우말고
        //이동하고 나서 또 이동!한 후 검증해야하지 않을까

        // x, y 벗어나지 않으면 추가


    }

    static void check1(int i, int j) {
        if (i - 2 > 0 && j + 1 < M) {
            //방문처리하고 나서 이 다음에 이미
            if (!board[i - 2][j + 1]) {
                board[i - 2][j + 1] = true;
                answer++;
            }


        }

    }

    static void check2(int i, int j) {
        if (i - 1 > 0 && j + 2 < M) {
            //
            if (!board[i - 1][j + 2]) {
                board[i - 1][j + 2] = true;
                answer++;
            }


        }

    }

    static void check3(int i, int j) {
        if (i + 1 < N && j + 2 < M) {
            //
            if (!board[i + 1][j + 2]) {
                board[i + 1][j + 2] = true;
                answer++;

            }

        }

    }

    static void check4(int i, int j) {
        if (i + 2 < N && j + 1 < M) {
            //
            if (!board[i + 2][j + 1]) {
                board[i + 2][j + 1] = true;
                answer++;
            }


        }

    }
}
