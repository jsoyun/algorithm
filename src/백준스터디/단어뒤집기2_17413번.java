package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class 단어뒤집기2_17413번 {

    //태그 단어가 아님 <> 안에는 뒤집지 않음, 태그와 단어사이 공백없다
    //띄어쓰기 기준으로 뒤집음

    //뒤집어서 출력 - 스택 사용
    //띄어쓰기 기준으로 새로 담기?
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();

        //스택에 저장하다가 공백이 나오면
        Stack<Character> stack = new Stack<>();
        Queue<Character> tagQueue = new LinkedList<>();
        boolean isTag = false;
        //꺼내서 답 문자열에 저장 (아무것도 없으면 그냥 저장, 이전 값이 있으면 " " 추가해서 저장)
        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);

            if (character == '<') { // 이면 다음값이 > 일때까지 큐에 담음
                isTag = true;
                tagQueue.add(character);
                continue;


            } else if (character == '>') {
                isTag = false;
                tagQueue.add(character);
                while (!tagQueue.isEmpty()) {
                    stringBuilder.append(tagQueue.poll());
                }
                continue;


            } else if (isTag) {
                tagQueue.add(character);


            }


            if (!isTag) {
                stack.push(character);
                //띄어쓰기랑 마지막 값 기준으로 뒤집었음
//                if (character == ' ' || i == string.length() - 1 || !isTag) {
//
//                    if (i == string.length() - 1) {
//                        stack.push(' ');
//
//                    }
//                    while (!stack.isEmpty()) {
//                        stringBuilder.append(stack.pop());
//                    }
//
//
//                }

            }
            //tag까지 저장하고나서 띄어쓰기 아니고 다음값이 '<'인경우에 넣어야함
            //예제 3, 5에서 막힘
            //태그말고 스택으로 저장해놓은 값을 꺼낼 것임.
            // 지금 코드는 공백을 만났을 때 다꺼냄, 마지막값일때 다 꺼냄, < 를 맞이했을 때 다 꺼냄.
            if (character == ' ' || i == string.length() - 1 || (!isTag && string.charAt(i + 1) == '<')) {

                //여기서 변수 발생 . 공백 만났을 때 스택을 뺀다
                if (i == string.length() - 1) {
                    stack.push(' ');

                }
                while (!stack.isEmpty()) {
                    stringBuilder.append(stack.pop());
                }


            }
            //i == string.length() - 1 포문끝났을 때 스택에 값 추가한다

            //역할을 분리!!!!
//            / 1. 태그인가? 문자열인가? 공백인가? // 1-1) 태그? // 1-2) 문자열? 태그 안 or 태그 밖 // 1-3) 공백? 태그 안 or 태그 밖


        }
        System.out.println("stringBuilder = " + stringBuilder);

    }

}
