package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT13 {

    //문제 접근 방법
    //아스키코드
//        //조건처리를 해줘야한다 13을 더해도 되는 것 안되는 것
//        M = 13까지는 13 더해도 됨 Z = 26
//        N = 14 부터는 + 13 = 27 -26 을 해줘야겠구만
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println("str = " + str);


        StringBuilder mutableString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char oneWord = str.charAt(i);
            if (oneWord > 'M' && oneWord <= 'Z') {
                System.out.println("oneWord = " + oneWord);
                char newWord = (char) ((oneWord + 13) - 26);
                mutableString.append(newWord);

            } else if (oneWord > 'm' && oneWord <= 'z') {
                char newWord = (char) ((oneWord + 13) - 26);
                mutableString.append(newWord);
            } else if (oneWord == ' ') {
                mutableString.append(' ');

            } else {
                char newWord = (char) (oneWord + 13);
                mutableString.append(newWord);

            }


        }

        System.out.println("mutableString= " + mutableString.toString());


        //isLetter 문자열잉면 true,
        //isUpperCase
//


    }
}
