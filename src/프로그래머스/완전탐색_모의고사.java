package 프로그래머스;

import java.util.ArrayList;

public class 완전탐색_모의고사 {
    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
//        int[] answers = {1, 3, 2, 4, 2};
//        solution(answers);

    }

    //기존코드

//    public static int[] solution(int[] answers) {
//
//        ArrayList<Integer> answerList = new ArrayList<>();
//
//        int first_A = 0;
//        int second_A = 0;
//        int Third_A = 0;
//
//        int firstList[] = {1, 2, 3, 4, 5};
//        int secondList[] = {2, 1, 2, 3, 2, 4, 2, 5};
//        int ThirdList[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//
//
//        for (int i = 0; i < answers.length; i++) {
//            if (answers[i] == firstList[i]) {
//                first_A++;
//            }
//            if (answers[i] == secondList[i]) {
//                second_A++;
//            }
//            if (answers[i] == ThirdList[i]) {
//                Third_A++;
//            }
//
//        }
//        int A[] = {0, first_A, second_A, Third_A};
//
//        int max = 0;
//
//        for (int i = 1; i < 4; i++) {
//
//            if (max < A[i]) {
//                max = A[i];
//                answerList.add(i);
//
//
//            } else if (max == A[i]) {
//
//                answerList.add(i);
//
//
//            }
//
//        }
//
////        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
//        int answer[] = {};
//        for (int i = 0; i < answerList.size(); i++) {
//            answer[i] = answerList.get(i);
//        }
//
//        return answer;
//    }
///////////////////해결 함 !! ///////////////

    public int[] solution(int[] answers) {

        ArrayList<Integer> answerList = new ArrayList<>();

        int first_A = 0;
        int second_A = 0;
        int Third_A = 0;

        int firstList[] = {1, 2, 3, 4, 5};
        int secondList[] = {2, 1, 2, 3, 2, 4, 2, 5};
        int ThirdList[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int score[] = new int[4];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == firstList[i % firstList.length]) {

                first_A++;
            }
            if (answers[i] == secondList[i % secondList.length]) {
                second_A++;

            }
            if (answers[i] == ThirdList[i % ThirdList.length]) {
                Third_A++;
            }

        }


        int A[] = {0, first_A, second_A, Third_A};

        int max = Math.max(Third_A, Math.max(first_A, second_A));

        if (max == first_A) answerList.add(1);
        if (max == second_A) answerList.add(2);
        if (max == Third_A) answerList.add(3);


        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();

        return answer;

    }

}

