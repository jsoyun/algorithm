package 알고리즘코딩테스트_패스트캠퍼스강의.문자열;

import java.util.Scanner;

public class 단어공부1157 {
    public static void main(String[] args) {
//        알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
//        //단, 대문자와 소문자를 구분하지 않는다.

        //첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
        // 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다 //가장많은 최대값 알파벳이 하나가 아니고 여러개면 안되겠구만

        Scanner scanner = new Scanner(System.in);
        String answer = "";
        String value = scanner.next();
        value = value.toLowerCase();
        int[] alphabet = new int[26];

        for (int i = 0; i < value.length(); i++) {
            alphabet[value.charAt(i) - 'a']++;

        }
        //배열index를 키값으로 해서 저장할까?

        int max = 0;
        int index = 0;
        //아니면 그냥 순회해보자
        for (int i = 0; i < alphabet.length; i++) {
            if (max < alphabet[i]) {
                max = alphabet[i];
                index = i;

            }

        }
        boolean doubleCheck = true;


        //index 와 같은 값이 또 있으면 ? , 없으면 출력
        for (int i = 0; i < alphabet.length; i++) {
            //이건 또 있으면이 아니라 걍 있으면 인데, 당연히 있겟지..
            //index 에 있는 값을 제외하고 싶은데..
//            alphabet[index] = 1000000;
            if (alphabet[i] == max && (i != index)) {

                doubleCheck = false;
                System.out.println("doubleCheck = " + doubleCheck);

            }


        }

        if (doubleCheck) {
            System.out.println("index = " + index);
            char lowerCaseChar = (char) (index + 'a');
            System.out.println("lowerCaseChar = " + lowerCaseChar);
            char upperCase = Character.toUpperCase(lowerCaseChar);
            answer = Character.toString(upperCase);
        } else {
            answer = "?";
        }

        System.out.println("max = " + max);
        System.out.println("index = " + index);
        System.out.println("answer = " + answer);

        //순회했을때 가장 큰 값은? MAX
        //근데 MAX와 같은 값이 있으면 ? 출력
        //없고 MAX 혼자 최대값이면 그 키값(인덱스 값에 + 'a' 하고 대문자로 바꿔서 출력..


    }
}
