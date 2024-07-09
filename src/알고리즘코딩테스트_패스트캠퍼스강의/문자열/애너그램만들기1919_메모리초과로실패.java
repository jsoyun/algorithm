package 알고리즘코딩테스트_패스트캠퍼스강의.문자열;

import java.util.Scanner;

public class 애너그램만들기1919_메모리초과로실패 {
    public static void main(String[] args) {
        //쪼개서 순서대로
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next();
        String string2 = scanner.next();
        String newString1 = "";
        String newString2 = "";


        for (int i = 0; i < string1.length(); i++) {

            boolean status = true;
            char c = string1.charAt(i);

            for (int j = 0; j < string2.length(); j++) {
                if (c != string2.charAt(j)) {
                    status = false;
                    newString1 += c;
                } else {
                    status = true;
                    newString2 += '_';

                }

            }
        }


        for (int i = 0; i < string2.length(); i++) {
            boolean status = true;

            char c = string2.charAt(i);
            System.out.println("c = " + c);

            for (int j = 0; j < string1.length(); j++) {
                if (c != string1.charAt(j)) {
                    System.out.println("string1.charAt(j) = " + string1.charAt(j));
                    status = false;
                    newString2 += c;
                } else {
                    status = true;
                    newString2 += '_';
                }

            }
            System.out.println("status = " + status);

        }

        int check = 0;
        System.out.println("newString1 = " + newString1);
        System.out.println("newString2 = " + newString2);


        for (int i = 0; i < newString1.length(); i++) {
            char c = newString1.charAt(i);
            if (c == '_') {
                check++;
            }

        }
        for (int i = 0; i < newString2.length(); i++) {
            char c = newString2.charAt(i);
            if (c == '_') {
                check++;
            }

        }

        System.out.println(check);

    }
}
