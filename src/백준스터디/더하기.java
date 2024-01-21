package 백준스터디;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//9095번

public class 더하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int max = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int input = scanner.nextInt();
            list.add(input);
            System.out.println("list = " + list);
            if (input > max)
                max = input;

        }

        int dp[] = new int[max + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= max; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        for (Integer integer : list) {
            System.out.println(dp[integer]);
        }

    }


}
