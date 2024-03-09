package 프로그래머스;

import java.util.Arrays;
import java.util.Comparator;

public class 정렬_가장큰수 {
    public static void main(String[] args) {
        int[] numbers = {6, 8, 2, 23, 25, 244};

        Integer[] newNumbers = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(newNumbers, new CustomComparator());
        StringBuilder result = new StringBuilder();

        int checkNum = 0;

        for (int num : newNumbers) {
            checkNum += num;
            result.append(num);

        }

        if (checkNum == 0) {
            System.out.println("0");

        }

        System.out.println(result.toString());
    }

    static class CustomComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            String strA = Integer.toString(a);
            String strB = Integer.toString(b);

            System.out.println("strA = " + strA);
            System.out.println("strB = " + strB);

            // 두 숫자를 각각의 자릿수까지 비교
            String concatAB = strA;
            String concatBA = strB;
            System.out.println("concatAB = " + concatAB);
            System.out.println("concatBA = " + concatBA);
            //concatBA가 "68"이고 concatAB가 "86"인 경우, "6"이 "8"보다 사전적으로 앞에 있으므로
            // -2가 반환된다

            System.out.println("concatBA.compareTo(concatAB) = " + concatBA.compareTo(concatAB));

            return concatBA.compareTo(concatAB);
        }
    }

}

/**
 * compareTo 메서드!
 * 두 개의 값을 비교해서 int 값으로 변환해주는 함수이다.
 * <p>
 * 숫자 비교: 단순히 "x가 compareTo y 보다 크다" 1 같다 0 작다 -1 의 관한 결과값 리턴
 * 문자열 비교: 같다 0 그외 양수/음수값
 * str ="abcd"
 * str.compareTo("abcd") 0
 * str.compareTo("ab") 2
 * str.compareTo("a") 3
 * str.compareTo("c") -2
 * "".compareTo(str) -4
 */
