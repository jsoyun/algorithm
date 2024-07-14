package 코딩테스트합격자되기_자바편.배열;

import java.util.Arrays;

public class array_ON2 {
    //sort()메서드를 사용하지 않고 O(N^2)알고리즘을 사용한다면?
    public static void main(String[] args) {
        int[] arr = new int[100000];
        long start = System.currentTimeMillis();
        int[] bubble = bubbleSort(arr);
        long end = System.currentTimeMillis();
        //시간 측정
        System.out.println("bubbleSort 시간 측정  = " + (end - start) / 1000.0 + "초");


        start = System.currentTimeMillis();
        int[] sort = doSort(arr);
        end = System.currentTimeMillis();
        System.out.println("doSort 시간 측정  = " + (end - start) / 1000.0 + "초");

        //두 개 배열이 같은지 확인
        System.out.println(Arrays.equals(bubble, sort));


    }


    private static int[] bubbleSort(int[] org) {
        int[] arr = org.clone();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            //
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    private static int[] doSort(int[] org) {
        int[] arr = org.clone();
        Arrays.sort(arr);
        return arr;
    }
}
