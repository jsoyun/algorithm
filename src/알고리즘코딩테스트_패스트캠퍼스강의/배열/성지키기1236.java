package 알고리즘코딩테스트_패스트캠퍼스강의.배열;

import java.util.Scanner;

public class 성지키기1236 {
    public static void main(String[] args) {
        //문제 모든 행과 열에 한명이상의 경비원이 있으면 좋겠다
        // 성의 크기 행열과, 경비원이 어디있는지 주어졌을때
        // 몇 명의 경비원을 최소ㅗ 추가해야 영식이 만족시킬지 구해라

        // 행의 크기 만큼 경비원을 채워야함
        // 배열로 행을 만들어서

        //입력값
        // 첫째줄에 성의 세로크기 N 가로크기 M
        //N,M은 <= 50 -> 최대 2500개
        //성 .은 빈칸x는 경비원있음
        //.

        //접근법 선택
        //모든 행,열에 최소로 있어라
        //가로행

        //보호받고 있는 행열을 지우기
        //남은 추가 보호가 필요한 행, 열 파악 -> 여기까지는 오케이 , 최소 경비원 어떻게 넣을지가 고민
        //

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        char[][] map = new char[N][M];
        for (int i = 0; i < N; i++) {
            //성 넣어줌
            map[i] = scanner.next().toCharArray();
        }
//방법 1
//        //1. 각 행,열에 대해 경비원이 있는지 확인한다
//        int existRowCount = 0;
//        for (int i = 0; i < N; i++) {
//            boolean exist = false;
//            for (int j = 0; j < M; j++) {
//                if (map[i][j] == 'X') {
//                    exist = true;
//                    break;
//                }
//            }
//            if (exist) existRowCount++;
//        }
//
//        int existColCount = 0;
//        for (int i = 0; i < M; i++) {
//            boolean exist = false;
//            for (int j = 0; j < N; j++) {
//                if (map[j][i] == 'X') {
//                    exist = true;
//                    break;
//                }
//            }
//            if (exist) existColCount++;
//        }
//
//        //2. 보호받지 못하는 행,열의 개수를 구한다
//        int needRowCount = N - existRowCount;
//        int needColCount = M - existColCount;
//
//        //3. 둘 중 큰 값을 출력한다 -> 아하  그렇네
//        System.out.println(Math.max(needRowCount, needColCount));

        //방법2
        //1. 각 행,열에 대해 경비원이 있는지 확인한다

        boolean[] existRow = new boolean[N];
        boolean[] existCol = new boolean[M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'X') {
                    existRow[i] = true;
                    existCol[j] = true;

                }
            }
        }
        //2. 보호받지 못하는 행,열의 개수를 구한다
        int needRowCount = N;
        int needColCount = M;
        for (int i = 0; i < N; i++) {
            if (existRow[i]) needRowCount--;
        }
        for (int i = 0; i < M; i++) {
            if (existCol[i]) needColCount--;
        }

        //3. 둘 중 큰 값을 출력한다 -> 아하  그렇네
        System.out.println(Math.max(needRowCount, needColCount));


    }
}
