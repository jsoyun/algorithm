package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬만들기1213 {
    public static void main(String[] args) throws IOException {
        //AABB -> ABBA
        //AAABB-> A
        //팰린드롬 앞뒤바꿔도 똑같은 숫자
        //답지 봄

        //홀수 개인 알파벳이 2개 이상이면 될 수 없다
        //모든 알파벳이 짝수개로만 있거나, 홀수개인 알파벳이 하나만 있을 때는 된다.
        // 사전순으로 앞서는 것을 출력해라
        // 알파벳 배열 저장해놨다가 -> 0~26 배열에 A가 0자리에 알파벳나온 횟수만큼 넣어준다.
        //odd 변수 = 홀수의 갯수
        // 홀수가 1개면 그 위치를 num값에 넣어준다. 홀수 알파벳이 2개 이상이면 오류 출력
        // 반복문 통해 입력받은 알파벳 갯수의 절반만 먼저 출력해라
        // 반만 출력하고 + 홀수 중간에 추가  + 앞부분반의 정반대 추가

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String N = bufferedReader.readLine();
        System.out.println("N = " + N);
        //알파벳 배열
        int[] alphabet = new int[26];
        //횟수만큼 넣어줄때 N이 순서대로 위치해있나? 어떻게 문자열에서 알파벳 갯수를 셀까?
        for (int i = 0; i < N.length(); i++) {
            int index = N.charAt(i) - 'A'; //오 이걸 생각못했다. //TODO: 아스키코드 조작 공부하기
            System.out.println("index = " + index);
            alphabet[index]++;
        }
        int odd = 0; //홀수갯수
        int num = 0; //홀수가 1개일때의 값

        //알파벳 배열 순회하면서 홀수갯수 찾기
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] % 2 != 0) {
                odd++;
                num = i;
            }

            if (odd >= 2) {
                System.out.println("I'm Sorry Hansoo");
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet[i] / 2; j++) {
                sb.append((char) (i + 'A'));
            }

            String result = sb.toString();
            if (odd == 1) {
                System.out.println("num = " + num);
                result += (char) (num + 'A');
                System.out.println("odd=1,result = " + result);

            }
            result += sb.reverse().toString();
            System.out.println("result = " + result);

        }


    }
}
