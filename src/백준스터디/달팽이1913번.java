package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 달팽이1913번 {

    //안쪽에서 바깥쪽으로 돌기

    //TODO: 백준 시간초과해결하기

    public static void main(String[] args) throws IOException {

        //입력받은 수 N
        //대각선
        // 7*7. 5*5 3*3 1 *1

        // 출력
        ///달팽이 출력 얘를 어떻게 채우지??
        // 둘째 줄 수의 위치 출력


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int number = Integer.parseInt(bufferedReader.readLine());

        int[][] box = new int[N][N];

        //바깥쪽에서 안쪽으로 돌기
        int value = N * N;
        int row = 0;
        int column = 0;

        int time = 0;
        int limit = N; //7

        while (value > 0) {
            column = time; //첫번째 시작은 time도 0이라서 0!

            //위에서 아래로
            for (int i = row; i < limit; i++) {
                box[i][column] = value--; //00 10 20
            }

            row = limit - 1; //row =6
            //column =0
            //맨아래 왼에서 우로
            for (int i = column + 1; i < limit; i++) { //column0이어서 0부터 시작하는데!
                box[row][i] = value--; //41 42
            }

            column = limit - 1; //column= 6
            //위로 올라가기!
            for (int i = row - 1; i >= time; i--) {  //34, 24 14 04
                box[i][column] = value--;
            }

            //왼쪽으로 가기
            row = time; //0?
            for (int i = column - 1; i > time; i--) { //5,4,3,2,1
                box[row][i] = value--;

            }


            time++; //시작0이고 다음순회부터 인덱스하나씩 넘어가야함
            limit--; //왼쪽 54321 하나씩 줄어들어야함.
            //빼고나서 지정해줘야하는구나 왜지..?
            row = time;


        }

        StringBuilder stringBuilder = new StringBuilder();
//        int tx = 0, ty = 0;
        //출력하기
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[0].length; j++) {
                System.out.print(box[i][j] + " ");

                //TODO: 원하는 수가 어디있는지! 헉.. number찾기..
                if (box[i][j] == number) {
                    stringBuilder.append(i + 1).append(" ").append(j + 1);
//                    ty = i + 1;
//                    tx = j + 1;

                }

            }
            System.out.println();
        }
        System.out.println(stringBuilder);

    }
}


