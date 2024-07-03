import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자정사각형1051번다시풀기 {
    public static void main(String[] args) throws IOException {

        //꼭짓점에 쓰여있는 수가 모두 같은 가장 큰 정사각형을 찾는 문제
        //직사각형 N M 값에서 최소값이 -> 최대  정사각형 크기가 된다.


        //꼭짓점의 수가 모두 같은 - 꼭짓점은 최대정사각형이 33 이라면
        //최대 정사각형으로 찾기
        // 0,0  0,2
        // 2,0 2,2 가 된다.

        //입력값을 표로 그러놓고 이중배열
        //순화하면서 찾기 -> 행은 인덱스 2까지 ,열 인덱스 4까지 돌 수 있음  -> 다 돌았는데 없음.
        // 이동은 모두 한 칸씩!

        // 최대 정사각형 사이즈 -1
        //0,0 0,1
        //1,0 ,1,1 로 조회 반복

        //정사각형 사이즈는 1보다 작아지면 그만!

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int board[][] = new int[N][M];

        for (int i = 0; i < N; i++) {
            String s1 = bufferedReader.readLine();
            for (int j = 0; j < M; j++) {
                char c = s1.charAt(j);
                board[i][j] = Integer.parseInt(String.valueOf(c));


            }
        }

        int maxSquare = Math.min(N, M); //3
        int distance = maxSquare - 1;
        int squareSize_answer = 0;
        int add = 0;
        while (maxSquare > 1) {
            for (int i = 0; i < N - maxSquare; i++) {
                for (int j = 0; j < M - maxSquare; j++) {

                    //인덱스를 벗어나기 전까지
                    //맨 왼쪽
//                    if (distance + add > N - 1) {
//                        break;
//                    }
//////                  맨오른쪽
//                    if (distance > M - 1) {
//                        break;
//                    }

                    //i =0 dis =2;
                    //i=1;
                    //i=2;
                    // 0,0 == 0,2 ,2,0,


                    if (board[i][j] == board[i][distance + j]
                            && board[i][distance + j] == board[i + distance][j]
                            && board[i + distance][j] == board[distance + i][distance + j]) {
                        squareSize_answer = maxSquare * maxSquare;
                    }
//                    add = 1;

                }
            }
            maxSquare--; //바로 빼지 않고 전체 순회 마치고 없으면!
        }
        System.out.println("squareSize_answer = " + squareSize_answer);


    }
}
