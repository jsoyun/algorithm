package 프로그래머스;

import java.util.ArrayList;

public class 스택큐_기능개발 {
    public static void main(String[] args) {
        int[] progresses = {95, 95, 95, 95, 95, 95, 94};
        int[] speeds = {5, 1, 5, 5, 1, 1, 1};

        solution(progresses, speeds);

    }


    private static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> publish = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();


        for (int i = 0; i < progresses.length; i++) {
            int a = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] > 0) {


                publish.add((a + 1));

            } else {
                publish.add(a);
            }


        }

        int headIndex = 0;
        int nextIndex = 1;
        int cnt = 1;
        publish.add(100);


        int size = publish.size();

        for (int i = 0; i < size - 1; i++) {


            if (publish.get(headIndex) < publish.get(nextIndex)) {

                answerList.add(cnt);
                cnt = 1;
                headIndex = nextIndex;
                nextIndex++;

            } else if (publish.get(headIndex) >= publish.get(nextIndex)) {
                cnt++;
                nextIndex++;

            }


        }

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }


        return answer;
    }


}