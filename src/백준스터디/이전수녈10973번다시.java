package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이전수녈10973번다시 {
    static int[] array;

    public static void main(String[] args) throws IOException {
        //앞에 다른 순열이 없으면 -1
        //다른 순열이 있으면 구해서 리턴한다.

        //입력받은  순열의 자리가 내림차순이라면 오름차순으로 바꿔줌
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(bufferedReader.readLine());
        array = new int[N];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {

            array[i] = Integer.parseInt(stringTokenizer.nextToken());

        }

//i와 j는 어떤 기준일까?

        if (perm()) {
            //하나씩 쌓아둔거 리턴
            for (int i = 0; i < N; i++) {
                System.out.print(array[i] + " ");
            }

        } else {
            System.out.println(-1);
        }


    }

    public static void change(int m, int n) {
        int k = array[m];
        array[m] = array[n];
        array[n] = k;


    }


    public static boolean perm() {
        //
//        while (true) {
        int i = array.length - 1; //i가 내가 체크하려는 것의 위치

        while (i > 0 && array[i - 1] <= array[i]) { // 오름차순이면 계속 반복 -> while
            i--; //문제없어서 다음 체크! //지금코드에서 이거자체가 쓸데가 없는

        }

        if (i <= 0) {
            return false;
        }


        //j도 전체 길이
        int j = array.length - 1;
        while (array[i - 1] <= array[j]) {
            j--;
        }
        change(i - 1, j); //오름차순 아닌 맨뒤 두자리 바꿔줘야함
        //바꿔줘야함
        j = array.length - 1;
        while (i < j) {
            change(i, j);
            i++;
            j--;
        }


//        // 2 1을 마주침!
//        while (array[i - 1] > array[i]) {
//            change(i - 1, i);
//        }


        return true;
    }
}
