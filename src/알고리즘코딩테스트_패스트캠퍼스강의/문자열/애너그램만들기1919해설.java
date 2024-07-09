package 알고리즘코딩테스트_패스트캠퍼스강의.문자열;

import java.util.Scanner;

public class 애너그램만들기1919해설 {

    public static void makeArray(int[] count, String value) {
        for (int i = 0; i < value.length(); i++) {
            count[value.charAt(i) - 'a']++;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        int[] countA = new int[26];
        int[] countB = new int[26];
        makeArray(countA, a);
        makeArray(countB, b);


        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(countA[i] - countB[i]);

        }

        System.out.println("ans = " + ans);

    }
}
