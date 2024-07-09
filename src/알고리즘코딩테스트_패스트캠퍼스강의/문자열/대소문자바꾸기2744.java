package 알고리즘코딩테스트_패스트캠퍼스강의.문자열;

import java.util.Scanner;

public class 대소문자바꾸기2744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String ans = "";
        for (int i = 0; i < next.length(); i++) {
            if ('A' <= next.charAt(i) && next.charAt(i) <= 'Z') {
                ans += (char) ('a' + next.charAt(i) - 'A');

            } else {
                ans += (char) ('A' + next.charAt(i) - 'a');
            }

        }

        System.out.println(ans);


    }
}
