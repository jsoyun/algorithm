package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

//11653번
public class 소인수분해 {

    public static void main(String[] args) throws IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String read = str.readLine();
        Integer value = Integer.parseInt(read);

//        int first = 5;
//
//
//        while (value > 1) {
//            if (value % 2 == 0) {
//                value = value / 2;
//                System.out.println("2");
//
//            } else if (value % 3 == 0) {
//                value = value / 3;
//                System.out.println("3");
//
//            } else if (value % 5 == 0) {
//                value = value / 5;
//                System.out.println("5");
//
//            } else {
//                first += 1;
//                if (value % first == 0) {
//                    value = value / first;
//                    System.out.println(first);
//                } else if (value < first) {
//                    break;
//                }
//
//
//            }
//        }

        int i = 2;
        while (i <= value) {
            if (value % i == 0) {
                System.out.println(i);
                value = value / i;
            } else {
                i++;

            }

        }


    }


}
