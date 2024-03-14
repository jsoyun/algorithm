package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 덩치7568번 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder sb = new StringBuilder();

        //입력
        int[][] size = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");

            for (int j = 0; j < 2; j++) {
                size[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //비교
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                //기준보다 덩치가 크다면 그 기준의 등수는 밀려난다
                if (size[i][0] < size[j][0] && size[i][1] < size[j][1]) {
                    rank++;
                }
            }
            sb.append(rank + " ");


        }


        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);

        bufferedReader.close();


    }

}
