package 알고리즘코딩테스트_패스트캠퍼스강의;


import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //TODO: 두수의 합 다시 보기
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
//        String s = br.readLine();// 라인단위로만 받을 수 있다.
//        int N = Integer.parseInt(s);
//
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//
//
////        int[] array = new int[N];
////        for (int i = 0; i < array.length; i++) {
////            array[i] = scanner.nextInt();
////        }
////
////        Arrays.sort(array);
////        for (int i : array) {
////            System.out.println(i);
////        }
//
//        //카운트 정렬 - 전체 시간복잡도 O(N): 10,000,000
//        int[] cnt = new int[10001];
//        //시간 복잡도 O(N)
//        for (int i = 0; i < N; i++) {
//            cnt[Integer.parseInt(br.readLine())]++;
//        }
//        //시간복잡도 O(max(10000, N))
//        //하나씩 꺼냄
//        for (int i = 1; i <= 10000; i++) {
//            while (cnt[i]-- > 0) {
//                bufferedWriter.write(i + "\n");
//            }
//        }
//
//        bufferedWriter.flush();

        //두수의 합
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int N = Integer.parseInt(s);
        int[] a = new int[N];

        String[] strings = bufferedReader.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(strings[i]);
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



