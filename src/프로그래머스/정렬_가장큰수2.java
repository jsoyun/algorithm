package 프로그래머스;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


/**
 * https://laugh4mile.tistory.com/175
 * 배열 정리할 때 Arryas.sort(),
 * 컬렉션List, Set 정리할 때 Collections.sort() 정렬 차이
 */
public class 정렬_가장큰수2 {
    public static void main(String[] args) {


        int[] numbers = {6, 8, 2, 23, 25, 244};
        String answer = "";

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }

        // Collections.sort는 음수를 오름차순으로 정렬!
        Collections.sort(list, (a, b) -> {
            String as = String.valueOf(a);
            String bs = String.valueOf(b);

            //compare은 비교해서 같으면 0, x>y는 양수, x<y는 음수반환
            // -를 붙이는 이유는  Collections.sort는 음수를 오름차순으로 정렬하기 때문에
            // 양수를 반환하게 해서 내림차순으로 정렬하게 하도록 한다.
            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));

        });

        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i);
        }

        answer = sb.toString();

        if (answer.charAt(0) == '0') {
            System.out.println("0");

        } else {
            System.out.println("answer = " + answer);
        }


    }
}
