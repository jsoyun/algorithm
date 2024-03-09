package 프로그래머스;

public class 완전탐색_모음_2 {
    public static int solution(String word) {
        int answer = word.length();
        int pos;

        for (pos = 0; pos < word.length(); pos++) {
            char c = word.charAt(pos);
            if (c == 'A') continue;
            int temp = 0;
            for (int i = 0; i <= 4 - pos; i++) {
                temp += Math.pow(5, i);
            }
            answer += temp * val(c);

        }
        return answer;
    }

    public static int val(char c) {
        if (c == 'E') return 1;
        else if (c == 'I') return 2;
        else if (c == 'O') return 3;
        else return 4;
    }

    public static void main(String[] args) {
        int result = solution("AAAAE");
        System.out.println("result = " + result);

    }
}
