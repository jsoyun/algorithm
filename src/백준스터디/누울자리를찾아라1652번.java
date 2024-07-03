package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 누울자리를찾아라1652번 {
    public static void main(String[] args) throws IOException {

        //영식이나 누울 수 있는 자리 조건
        // 똑바로 연속해서 2칸 이상의 빈 칸이 존재하는 곳 - 가로 , 세로,
        // 가로를 하나로 보는구나 - 무조건 2칸 이상히면 하나
        //세로도 하나씩 차지  - 2칸 이상 있으면 하나

        //입력 방의 크기 N과 방의 구조가 주어죴울 때
        // 출력 첫째 줄에 가로로 누울 수 있는 자리 출력, 다음 세로로 누울 수 있는 자리 갯수 출력

        //놓친것! : 가운데 짐이 하나 있어서 양옆이 2개 ,2개면 - 누울 수 있는 자리 2개다.

        //입력값대로 이차원 배열 만들기
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int N = Integer.parseInt(s);
        int width = 0; //가로
//        int width_sizeCheck = 0;
//        boolean width_state = false;
        int length = 0; //세로
        System.out.println("s = " + s);

        Character[][] room = new Character[N][N];

        //이차원 배열에 담아두기

        for (int i = 0; i < N; i++) {
            String s1 = bufferedReader.readLine();
            for (int j = 0; j < N; j++) {
                room[i][j] = s1.charAt(j);
            }
        }


        //가로
//        for (int i = 0; i < N; i++) {
//
//            for (int j = 0; j < N; j++) {
//               if ( room[i][j] )
//
//            }
//
//        }


//        for (int i = 0; i < N; i++) {
//            String s1 = bufferedReader.readLine();
//            for (int j = 0; j < N; j++) {
//                room[i][j] = String.valueOf(s1.charAt(j));
//
//            }
//        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                stringBuilder.append(room[j][i]);
                String s1 = String.valueOf(stringBuilder);
                System.out.println("s2 = " + s1);
                if (s1.contains("..")) {
                    length++;
                    break;

                }

            }
        }


//        for (int i = 0; i < N; i++) {
//            System.out.println();
//            for (int j = 0; j < N; j++) {
//                System.out.print(room[i][j]);
//
//            }
//
//        }

        System.out.println("width = " + width);
        System.out.println("length = " + length);


    }
}
