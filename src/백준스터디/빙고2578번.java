package 백준스터디;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 빙고2578번 {

    //1. 입력값 표 만들기
    //2 부르는 수 , 표에 표시, 카운트
    //3. 빙고 그리기
    //4. 빙고가 완성된 순간! 몇 번째 수인지 출력.

    //빙고가 완성됐는지 어떻게 알까
    //가로 : i,0 ~ i,5 //i는 0부터 5까지 ->5번
    //세로 : 0,i ~ 5,i // i는 0부터 5까지 ->5번
    //대각선 : 0,0 1,1 2,2, 3,3 4,4 5,5 // 0,0에서 시작해서 1씩 더한다? 5번.? ->1번
    //반대대각선: 5,0 4,1 3,2 2,3 1,4 0,5 // 5,0에서 -1,+1 5번한다
    //이렇게 순회해서 확인!했을 때 빙고가 색칠되어 있으면 카운트! 3개 이상이면 빙고!!


    //1.
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int[][] board = new int[5][5];

        for (int i = 0; i < 5; i++) {
            String line = bufferedReader.readLine();
            String[] strings = line.split(" ");

            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(strings[j]);


            }
        }

        //나머지 값은 큐로 저장해놓을까..?
        Queue<Integer> queue = new LinkedList<>();

        //입력하는 법 찾아봄..
        String nextLine;
        while ((nextLine = bufferedReader.readLine()) != null && nextLine.length() != 0) {
            String[] tokens = nextLine.split(" ");

            for (String token : tokens) {
                queue.add(Integer.parseInt(token));
            }
        }

        System.out.println("queue = " + queue);


        int countNumberOrder = 0;
        int countBingo = 0;

        //큐에서 하나씩 꺼내면서 빙고보드에 표시해아함 0으로 표시
        while (!queue.isEmpty()) {
            Integer check = queue.poll();
            countNumberOrder++;
            for (int i = 0; i < 5; i++) {

                for (int j = 0; j < 5; j++) {
                    if (board[i][j] == check) {
                        board[i][j] = 0;
                    }


                }
            }

            //헉설마 countBingo가 먼저 빙고 3이 되는 이유가..
            //막상 빙고는 2개밖에 없는데 3이 되는 이유가..
            //같은 빙고를 또 카운트해서 그런가???

            //TODO: 한번만 카운트되게 어떻게 하지..?


            //빙고됐는지 체크
            //빙고가 완성됐는지 어떻게 알까
            //가로 : i,0 ~ i,4 //i는 0부터 5까지 ->5번
            for (int i = 0; i < 5; i++) {
                //i가 0일때
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


            //세로 : 0,i ~ 4,i // i는 0부터 4까지 ->5번
            for (int i = 0; i < 5; i++) {
                //i가 0일때
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
            //대각선 : 0,0 1,1 2,2, 3,3 4,4  // 0,0에서 시작해서 1씩 더한다? 5번.? ->1번
            for (int i = 0; i < 5; i++) {
                int count = 0;
                if (board[i][i] == 0) {
                    count++;
                    if (count == 5) {
                        countBingo++;
                    }
                }
            }
            //반대대각선: 4,0 3,1 2,2 1,3 0,4 // 5,0에서 -1,+1 5번한다
            for (int i = 4; i >= 0; i--) {
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
//            for (int i = 0; i < 5; i++) {
//                int count = 0;
//
//                if (board[i][4 - i] == 0) {
//                    count++;
//                    if (count == 5) {
//                        countBingo++;
//                    }
//                }
//
//
//            }

            //이렇게 순회해서 확인!했을 때 빙고가 색칠되어 있으면 카운트! 3개 이상이면 빙고!!
            if (countBingo >= 3) {
                queue.clear();
            }

            countBingo = 0; //초기화하는 이유는? 뭘까? 아 내부에서 빙고를 계속 세니까 처음부터 다시 세어야하는군!!

        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println();
//
//            for (int j = 0; j < 5; j++) {
//
//                System.out.print(board[i][j] + " ");
//
//
//            }
//        }


        System.out.println("countNumberOrder = " + countNumberOrder);


    }


}
