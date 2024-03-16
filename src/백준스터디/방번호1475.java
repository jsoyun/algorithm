package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class 방번호1475 {
    public static void main(String[] args) throws IOException {

        //이중 포문 안됨

        //TODO: 가장많이 중복된 숫자의 갯수를 구하라!!!

        //한 세트 0~9 배열에서 boolean
        boolean[] numberSet = new boolean[11]; //기본 false
        int set = 1;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        System.out.println("N = " + N);
        Stack<Integer> stack = new Stack<>();
        while (N > 0) {

            int value = N % 10;
            System.out.println("나머지:" + value);
            stack.push(value);
            N /= 10;
        }

        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println("value = " + value);

            if (value == 6 || value == 9) {
                switch (value) {
                    case 9:
                        if (numberSet[9] == false) {
                            numberSet[9] = true;
                        } else if (numberSet[6] == false) {
                            numberSet[6] = true;

                        } else {
                            set++;
                        }


                        break;

                    case 6:
                        if (numberSet[6] == false) {
                            numberSet[6] = true;
                        } else if (numberSet[9] == false) {
                            numberSet[9] = true;

                        } else {
                            set++;
                        }
                        break;
                }

            } else {

                if (numberSet[value]) {
                    set++;
                }
                numberSet[value] = true;

            }


        }

        System.out.println("set = " + set);
        System.out.println("Arrays.toString(numberSet) = " + Arrays.toString(numberSet));

    }
}
