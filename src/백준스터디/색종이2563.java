package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이2563 {

    //0부터 1까지가 한칸이 된다. 그래서 10까지. 10미만으로 계산해야함
    //한칸씩 채워서 넓이를 구한다고 생각하고
    // 하나씩 순회해서 하다
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //색종이 개수
        int n = Integer.parseInt(bufferedReader.readLine());
        //검은 영역의 넓이
        int total = 0;
        //도화지
        boolean[][] arr = new boolean[101][101];

        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        total++;
                    }
                }

            }
        }

        System.out.println("total = " + total);


    }
}
