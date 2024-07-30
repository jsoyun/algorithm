package 프로그래머스.배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {5, 0, 2, 7};
//        int[] numbers = {2, 1, 3, 4, 1};
        solution.solution(numbers);
    }

}

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();

//        Arrays.stream(numbers).distinct().sorted().forEach(e -> System.out.println("e = " + e));
        //중복 삭제 및 오름차순정렬
        int[] array = Arrays.stream(numbers).sorted().toArray();

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                answer.add(array[i] + array[j]);
            }


        }


        return answer.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();


    }
}
