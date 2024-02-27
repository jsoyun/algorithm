package 프로그래머스;

import java.util.Stack;

public class 스택큐_올바른괄호 {
    public static void main(String[] args) {
        String a = "(()(";
        solution(a);
    }


    private static boolean solution(String s) {
        boolean answer;
        Stack<Character> stack = new Stack<>();
        Stack<Character> check = new Stack<>();
        char sToArray[] = s.toCharArray();

        for (char a : sToArray) {
            if (a == '(') {
                stack.push(a);

            } else if (a == ')') {
                check.push(a);

                if (!stack.isEmpty()) {
                    if (stack.pop() == '(') {
                        check.pop();

                    }
                }


            }


        }

        if (stack.isEmpty() && check.isEmpty()) {
            answer = true;

        } else {
            answer = false;
        }

        System.out.println(answer);
        return answer;
    }

}
