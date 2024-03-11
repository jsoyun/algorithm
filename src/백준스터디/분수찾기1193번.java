package 백준스터디;

import java.util.Scanner;

public class 분수찾기1193번 {
    public static void main(String[] args) {
        //입력받을 X값
        //해당 범위의 대각선 칸 개수(cross_count)
        //해당 대각선 직전 대각선까지의 칸의 누적합(prev_count_cum)

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        int cross_count = 1;
        int prev_count_sum = 0;

        while (true) {
            //직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
            if (x <= prev_count_sum + cross_count) {
                if (cross_count % 2 == 1) { //대각선의 개수가 홀수라면
                    //분자가 큰 수부터 시작
                    //분자는 대각선상 내의 블럭 개수 - (X번째 - 직전 대각선까지의 블럭 개수 -1)
                    //분모는 x번째 -  직전 대각선까지의 블럭 개수
                    System.out.print((cross_count - (x - prev_count_sum - 1)) + "/" + (x - prev_count_sum));
                    break;

                } else {
                    System.out.println((x - prev_count_sum) + "/" + (cross_count - (x - prev_count_sum - 1)));
                    break;
                }
            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }

    }
}
