package 프로그래머스.배열;

import java.util.Arrays;

/**
 * 비열에서 체크하는 식으로 풀었다
 * 체크를 통해 조회하는 길이를 줄여나가서 배열로 푸는 것이 가능했음
 */
public class 실패율 {

    public int[] solution(int N, int[] stages) {

        int[] N_num = new int[N + 2]; //로 하는 이유는
        //N이


        //set으로 저장하면 꺼내기 쉬우려나?
        //아니면 순서대로 정렬하기
        Arrays.sort(stages);

        //분자
        for (int i = 1; i < N_num.length; i++) {
            //i =1
            //stages 배열에서 i를 찾기
            for (int j = 0; j < stages.length; j++) { //여기서부터 안더해졌구나
                if (stages[j] == i) {
                    N_num[i] += 1;

                }


            }

            System.out.println(i + ":" + N_num[i]);

        }

        //stages를 순서대로
        //분모
        int[] dorm = new int[N + 2];

        for (int i = 1; i < dorm.length; i++) {
            int count = 0;
            //stages 배열에서 i를 찾기
            for (int value : stages) { //여기서부터 안더해졌구나
                if (value == i) { // stages[0] ==2면 i = 2 만큼 1,2 로 개산해야함
                    //같으면 i만큼 N에서 1부터 i까지 하나씩 더해줘야함!

                    for (int k = 1; k <= i; k++) {
                        dorm[k] += 1;
                        System.out.println("dorm[k]:" + k + ":" + "1더힘");
                        System.out.println("value:" + value);
                    }


                }


            }


        }
        System.out.println(":" + Arrays.toString(dorm));
        //왜 1씩 모자르지?


        //실패율 저장 (분자/분모 값)
        double[] answerList = new double[N_num.length];
        for (int i = 1; i < dorm.length; i++) {
            if (N_num[i] == 0) {
                answerList[i] = 0;
            } else {
                //2. double로 형변환해서 계산
                answerList[i] = (double) N_num[i] / dorm[i];
                System.out.println("   answerList[i] = " + answerList[i]);
            }


        }

        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answerList));


        //그래서 어떻게 answerList배열의 최대값을 출력하면서 같은 값이면 인덱스를 앞자리부터 출력하지?
        //에 대한 gpt의 도움으로 함~! checked 배열을 만들어서 체크
        int[] sortedStages = new int[N]; //N으로 하는 이유는
//        boolean[] checked = new boolean[N + 1];  //따로 체크하는 이유는
//        for (int i = 0; i < N; i++) {
//            double max = -1;
//            int index = -1;
//            for (int j = 1; j <= N; j++) {
//                if (!checked[j] && answerList[j] > max) {
//                    max = answerList[j];
//                    index = j;
//                }
//
//            }
//            sortedStages[i] = index;
//            checked[index] = true;
//        }


        //answerList에서 체크하고 나서 해당 최대값을 없애볼까?
//        double max = -1;
//        int maxIndex = -1;

        //solution:[3, 4, 2, 1, 5]

        int[] AnotherSortedStages = new int[N];

        for (int i = 0; i < N; i++) {
            double max = -1;
            int index = -1;
            for (int j = 1; j <= N; j++) {
                if (answerList[j] > max) {
                    max = answerList[j];
                    index = j;
                }

            }
            sortedStages[i] = index;
            answerList[index] = -1; //체크한 최대값을 -1로 만들어줌
//            checked[index] = true;
        }

//        max = 0;


        return sortedStages;


    }


    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        실패율_빨간책답변 실패율 = new 실패율_빨간책답변();

        int[] solution = 실패율.solution(N, stages);
        System.out.println("solution:" + Arrays.toString(solution));

    }
}
