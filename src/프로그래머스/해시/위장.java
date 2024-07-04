package 프로그래머스.해시;

import java.util.HashMap;
import java.util.Iterator;

public class 위장 {
    public static void main(String[] args) {
        위장 위장 = new 위장();
        String[][] value = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int solution = 위장.solution(value);
        System.out.println("solution = " + solution);
    }

    public int solution(String[][] clothes) {


        HashMap<String, Integer> clothesMap = new HashMap<>();

        //1. 옷을 종류별로 구분하기 그리고 종류에 따라 옷의 갯수를 더하기
        for (String[] value : clothes) {
            String type = value[1];
            clothesMap.put(type, clothesMap.getOrDefault(type, 0) + 1);
        }


        //2. 입지 않는 경우를 추가하여 모든 조합 계산하기
        Iterator<Integer> it = clothesMap.values().iterator();
        int answer = 1;
        while (it.hasNext()) {
            answer *= it.next().intValue() + 1;
        }

        return answer - 1;


    }

}
