package 알고리즘코딩테스트_패스트캠퍼스강의.배열;

import java.io.*;

public class 수정렬하기 {

    //10989
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String s = br.readLine();// 라인단위로만 받을 수 있다.
        int N = Integer.parseInt(s);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


//        int[] array = new int[N];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        Arrays.sort(array);
//        for (int i : array) {
//            System.out.println(i);
//        }

        //카운트 정렬 - 전체 시간복잡도 O(N): 10,000,000
        int[] cnt = new int[10001];
        //시간 복잡도 O(N)
        for (int i = 0; i < N; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }
        //시간복잡도 O(max(10000, N))
        //하나씩 꺼냄
        for (int i = 1; i <= 10000; i++) {
            while (cnt[i]-- > 0) {
                bufferedWriter.write(i + "\n");
            }
        }

        bufferedWriter.flush();

    }
}
