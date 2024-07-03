package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자정사각형1051 {
    public static void main(String[] args) throws IOException {
        //N, M 50보다 작거나 같은 수
        //둘때 줄부터 N개의 줄에 수가 주어진다..

        //각 칸에 한자리 숫자가 적혀있다.
        // 꼭짓점에 쓰여져있는 수가 모두 같은 가장 큰 정사각형을 찾는 문제!!!

        //3,5
        //TODO: 정사각형의 크기를 출력한다


        //꼭짓점 값이 같아야함.
        //정사각형이어야함 - 변의 길이
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] sizes = bufferedReader.readLine().trim().split(" ");
        int N = Integer.parseInt(sizes[0]);
        int M = Integer.parseInt(sizes[1]);

        int[][] rectangle = new int[N][M];

        for (int i = 0; i < N; i++) {
            //행에 따라 열의 값 넣는중
            String line = bufferedReader.readLine().trim();
            for (int j = 0; j < M; j++) {
                //0'을 빼주면 48 - 48 = 0이 되고, '1'을 빼주면 49 - 48 = 1이 된다
                // 따라서, 문자로 입력된 숫자를 정수형으로 변환할 수 있게 된다
                rectangle[i][j] = line.charAt(j) - '0';

            }

        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(rectangle[i][j]);
            }
            System.out.println();
        }

        int maxLength = Math.min(N, M);
        int index_maxLength = maxLength - 1;
        System.out.println("maxLength = " + maxLength);

        //maxLength길이 만큼 반복할거임

        int leftT, rightT, leftB, rightB; //다 같은 것의 넓이..
//        leftT = rectangle[0][0];
//        rightT = rectangle[0][index_maxLength];
//        leftB = rectangle[index_maxLength][0];
//        rightB = rectangle[index_maxLength][index_maxLength];

//        if (leftT == rightT && rightT == leftB && leftB == rightB) {
//            System.out.println(index_maxLength * index_maxLength);
//
//        }
        int start_i = 0;
        int start_j = 0;
        int start_i_end = start_i + index_maxLength;
        int start_j_end = start_j + index_maxLength;

        for (int i = start_i; i < N; i++) {
            for (int j = start_j; j < M; j++) {
                leftT = rectangle[0][0];
                rightT = rectangle[0][start_i_end];
                leftB = rectangle[start_j_end][0];
                rightB = rectangle[start_i_end][start_j_end];

                start_i = start_i + 1;
                start_i_end = start_i_end + index_maxLength;
                start_j = start_j + 1;
                start_j_end = start_j_end + index_maxLength;


                if (leftT == rightT && rightT == leftB && leftB == rightB) {
                    System.out.println(index_maxLength * index_maxLength);
                    return;

                }


            }
        }


//        for (int i = 0; i < ; i = i + maxLength) {
//
//
//        }

    }
}
