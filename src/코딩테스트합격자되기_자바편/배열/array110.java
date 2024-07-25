package 코딩테스트합격자되기_자바편.배열;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;
import java.util.stream.Stream;

//110쪽
public class array110 {
    public static void main(String[] args) {

    }
}

class Solution {
    private static int[] solution(int[] arr) {

        Arrays.stream(arr).boxed().distinct();
        //중복값 제거
        Integer[] result = Arrays.stream(arr).boxed().distinct()
                .toArray(Integer[]::new);
        //내림차순 정렬
        Arrays.sort(result, Collections.reverseOrder());
        //int형 배열로 변경 후 반환
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

}


class SolutionNotStream {
    private static int[] solution(int[] arr) {

        //중복값 제거 // 내림차순 정렬
        //TreeSet은 set인터페이스를 구현하는 컬렉션 중 하나 - Red-Black Tree라는 자가 균형 이진 탐색 트리를 사용
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num : arr) {
            set.add(num);
        }

        //int형 배열에 담아서 반환
        int[] result = new int[set.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = set.pollFirst();
        }
        return result;
    }

}