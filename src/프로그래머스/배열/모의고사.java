package 프로그래머스.배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 모의고사 {
//    static int[] answers = {1, 2, 3, 4, 5};
    //    static int[] answers = {1, 3, 2, 4, 2};

    static int[] answers = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    static int[] checkBox = new int[4]; // 0 1 2 3

    int[] number1 = {1, 2, 3, 4, 5};
    int[] number2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] number3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//    private int numberIndex;

    public void checkMethod(int[] number, int index, int[] answers) {
        int numberIndex = 0;

        //1번
        for (int answerIndex = 0; answerIndex < answers.length; answerIndex++) {
            if (numberIndex == number.length) {
                numberIndex = 0;
            }


            if (answers[answerIndex] == number[numberIndex]) {
                //만약 1번이면
                checkBox[index] += 1;

            }

            numberIndex++;


        }

    }

    public int[] solution(int[] answers) {

        checkMethod(number1, 1, answers);
        checkMethod(number2, 2, answers);
        checkMethod(number3, 3, answers);

        //누가 정답 제일 높은 사람이 한명이면 그사람 출력
        int maxScore = -1; //가장 높은 점수
        int maxPerson = 0; // 점수가 가장 높은 사람인덱스

        for (int i = 0; i < checkBox.length; i++) {
            if (checkBox[i] > maxScore) {
                maxScore = checkBox[i];
                maxPerson = i;

            }
        }

        //if checkBox에 최대값이 같은 인덱스 체크 -> 여러 명 출력
        //maxScore
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < checkBox.length; i++) {
            if (maxScore == checkBox[i]) {
                answer.add(i);

            }

        }

        int[] array = answer.stream().mapToInt(Integer::intValue).toArray();


        //내부 확인용 출력
        Arrays.stream(checkBox).forEach(e -> System.out.println("e = " + e));

        return array;
    }

    public static void main(String[] args) {
        모의고사 모의고사 = new 모의고사();
        int[] solution = 모의고사.solution(answers);
        System.out.println(Arrays.toString(solution));
    }

}


