package 프로그래머스;

import java.util.ArrayList;
import java.util.List;

public class 완전탐색_모음사전 {
    static List<String> list = new ArrayList<>();

    static void dfs(String str, int len) {
        if (len > 5) return;
        list.add(str);
        for (int i = 0; i < 5; i++) {

            dfs(str + "AEIOU".charAt(i), len + 1);
        }

    }

    public static int solution(String word) {
        dfs("", 0);
        return list.indexOf(word);
    }

    public static void main(String[] args) {
        int answer = solution("EIO");
        System.out.println(answer);

    }

}
