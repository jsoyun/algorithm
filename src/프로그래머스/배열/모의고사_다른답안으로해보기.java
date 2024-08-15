package 프로그래머스.배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사_다른답안으로해보기 {
    static int[] answers = {1, 3, 2, 4, 2, 1, 1};

    public static int[] solution(int[] answers) {

        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] hit = new int[3];
        for (int hit_index = 0; hit_index < hit.length; hit_index++) {
            for (int answer_index = 0; answer_index < answers.length; answer_index++) {
                if (patterns[hit_index][answer_index % patterns[hit_index].length] == answers[answer_index]) {
                    hit[hit_index]++;
                }
            }
        }


        //최대값 구하기1 // 이걸 써야함
        int max = Math.max(hit[0], Math.max(hit[1], hit[2]));
        //최대값 구하는 또다른 방식2
//        int max = Arrays.stream(hit).max().getAsInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < hit.length; i++) {
            if (max == hit[i]) list.add(i + 1); //최댓값 갖고 있는 인덱스를 순서로 출력하는군

        }
//        int[] answer = new int[list.size()];
//        int cnt = 0;
//        for (int num : list){
//            answer[]
//        }

        return hit;


    }

    public static void main(String[] args) {
        모의고사_다른답안으로해보기 모의고사 = new 모의고사_다른답안으로해보기();
        int[] solution = 모의고사.solution(answers);
        System.out.println(Arrays.toString(solution));
    }
}


