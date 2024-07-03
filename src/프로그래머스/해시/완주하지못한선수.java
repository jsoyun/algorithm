package 프로그래머스.해시;

import java.util.*;

public class 완주하지못한선수 {


    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        완주하지못한선수 완주하지못한선수 = new 완주하지못한선수();
        System.out.println("  완주하지못한선수.solution(participant, completion) = " + 완주하지못한선수.solution(participant, completion));

    }


    public String solution(String[] participant, String[] completion) {

        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
        for (String player : completion)
            map.put(player, map.getOrDefault(player, 0) - 1);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value != 0) {
                answer = key;
                break;
            }

        }

        System.out.println("answer = " + answer);
        return answer;


    }


}
