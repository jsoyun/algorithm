package 알고리즘코딩테스트_패스트캠퍼스강의.배열;

import java.io.*;
import java.util.Arrays;

public class 두수의합 {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int N = Integer.parseInt(s);
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(Arrays.toString(bufferedReader.readLine().split(" ")));
        }

        String s1 = bufferedReader.readLine();
        int x = Integer.parseInt(s1);
        boolean[] exist = new boolean[1000001];

        for (int i = 0; i < N; i++) {
            exist[a[i]] = true;
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            //페어값
            int pairValue = x - a[i];
            //인덱스로 사용할 때는 항상 범위 체크 해야함
            if (0 <= pairValue && pairValue <= 1000000) {
                ans += exist[pairValue] ? 1 : 0;
            }

        }
        System.out.println("ans /2 = " + ans / 2);

    }
}
