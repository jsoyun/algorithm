package 백준스터디;

//극장의 한 줄의 정보가 주어진다. 이때, 이 줄에 사람들이 모두 앉았을 때, 컵홀더에 컵을 꽂을 수 있는 최대 사람의 수를 구하는 프로그램을 작성

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 컵홀더2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Integer.parseInt(reader.readLine());
        String read2 = reader.readLine();


        int answer = 0;
        int LL = 0;
        boolean S = true;

        while (read2.contains("S")) {  //SSS > 3개
            answer += 1;
            read2 = read2.replaceFirst("S", "");
        }

        while (read2.contains("LL")) {  //SLL 3개 1, 2명 //S-LL-LL - 1개 LL 짝수면 +1 // LLLL  11 +1
            S = false;
            answer += 1;
            LL += 1;
            read2 = read2.replaceFirst("LL", "");

        }
//얘개 문제다~!
//        if (LL > 0 && LL % 2 == 0) {
//            answer += 1;
//        }

        if (S) {
        } else {
            answer = answer + 1;
        }

        System.out.println(answer);


    }
}
