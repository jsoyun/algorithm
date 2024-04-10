package 백준스터디;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class 국회의원선거1417번답지 {

    //답지 https://tussle.tistory.com/942
    public static void main(String[] args) throws IOException {

        //우선순위 큐를 이용하여 다른 후보의 표보다 다솜이의 표가 많을 때까지 매수를 진행한다.
        // 매수를 진행한 횟수를 결과로 출력한다
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //결과값 출력하는 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());
        int answer = 0;

        if (N != 1) {
            //댜른 후보 투표수 내림차순 우선순위 큐
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            //다른 후보 투표수 저장
            for (int i = 1; i < N; i++) {
                priorityQueue.add(Integer.parseInt(bufferedReader.readLine()));
            }
            //다른 후보의 사람들 매수 진행
            while (priorityQueue.peek() >= M) {
                int cur = priorityQueue.poll();
                cur--;
                M++;
                answer++;
                priorityQueue.add(cur);
            }


            bw.write(answer + "");
            bw.flush();
            bw.close();
            bufferedReader.close();
        }


    }
}
