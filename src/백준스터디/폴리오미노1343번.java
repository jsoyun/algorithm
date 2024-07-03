package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 폴리오미노1343번 {
    public static void main(String[] args) throws IOException {

        //폴리오미노
        //AAAA ,BB 4개 2개로 감싸야함
        //짝수여아함
        //2,4,6,8,10
        //출력할때
        //2면 BB //2보다 큰 짝수이면 AAAA //AAAA로 나눴을 때 몫만큼 AAAA온다.
        //.까지 X카운트

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = s1.split("\\.");
        for (int i = 0; i < strings.length; i++) {

            String string = strings[i];
            if (string.length() % 2 != 0) {
                stringBuilder = new StringBuilder("-1");

            }
        }


    }
}
