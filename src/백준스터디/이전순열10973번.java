package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이전순열10973번 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] array;
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        array = new int[N];
        for (int i = 0; i < N; i++) {
            String s1 = st.nextToken();
            array[i] = Integer.parseInt(s1);
        }


        if (nextPermutation()) {
            for (int i = 0; i < N; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("-1");
        }

    }

    private static boolean nextPermutation() {
        int i = array.length - 1;
        while (i > 0 && array[i - 1] <= array[i]) { //뒤에서부터 두개씩 오름차순인지 검사!
            //전체길이에서 하나씩 빼줌
            i--;
        }

        if (i <= 0) {
            //0이 되거나 더 작아지면 false
            return false;
        }
        //j도 전체 길이
        int j = array.length - 1;
        while (array[j] >= array[i - 1]) {
            j--;
        }
        swap(i - 1, j); //오름차순 아닌 맨뒤 두자리 바꿔줘야함
        //바꿔줘야함
        j = array.length - 1;
        while (i < j) {
            swap(i, j);
            i++;
            j--;
        }

        return true;
    }


    //바꿔주는 역할
    private static void swap(int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


}
