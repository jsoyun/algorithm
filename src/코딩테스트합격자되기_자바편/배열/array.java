package 코딩테스트합격자되기_자바편.배열;

import java.util.Arrays;

public class array {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(array(new int[]{1, -5, 2, 4, 3})));
        System.out.println(Arrays.toString(array(new int[]{2, 1, 1, 3, 2, 5, 4})));
        System.out.println(Arrays.toString(array(new int[]{6, 1, 7})));
    }

    // 이 부분을 변경해서 실행해보세요.
    private static int[] array(int[] arr) {
        //복사해서 정렬
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;


//        //원본배열을 그대로 정렬함
//        Arrays.sort(arr);
//        return arr;
    }


}
