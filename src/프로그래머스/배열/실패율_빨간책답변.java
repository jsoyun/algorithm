package 프로그래머스.배열;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 */

public class 실패율_빨간책답변 {

    public int[] solution(int N, int[] stages) {

        //1. 스테이지별 도전자 수를 구한다.
        int[] challenger = new int[N + 2];
        Arrays.sort(stages);
        for (int i = 1; i < stages.length; i++) {
            challenger[stages[i]] += 1;
        }

        //2. 스테이지별 실패한 사용자 수 계산
        HashMap<Integer, Double> fails = new HashMap<>();
        //왜 해시맵을 썼을까? : 해시맵은 키값이 있다.
        //다른 키값있는건 없어?
        double total = stages.length;
        //3. 각 스테이지를 순회하며, 실패율 계산
        for (int i = 1; i <= N; i++) {
            if (challenger[i] == 0) { //4. 도전한 사람이 없는 경우, 실패율은 0
                fails.put(i, 0.0); //그 인덱스랑 실패율을 추가한다.
            } else {
                fails.put(i, challenger[i] / total); //5. 실패율 구함
                total -= challenger[i];

            }
        }


        //7. 실패율이 높은 스테이지부터 내림차순으로 정렬
        return fails.entrySet().stream().sorted((o1, o2)
                -> Double.compare(o2.getValue(), o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();


    }

    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        실패율_빨간책답변 실패율 = new 실패율_빨간책답변();

        int[] solution = 실패율.solution(N, stages);
        System.out.println("solution:" + Arrays.toString(solution));

    }
}
