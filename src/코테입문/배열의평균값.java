package 코테입문;

import java.util.Arrays;

public class 배열의평균값 {


    public static void main(String[] args) {
        System.out.println("args.length = " + args.length);
        System.out.println("args = " + args);
        double value1 = 11 / 2;  //value: 5.0;
        double value2 = 11 / 2.0; //value: 5.5
        double value3 = (double) 11 / 2; //value: 5.5

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(numbers).average().orElse(0);

    }


}
