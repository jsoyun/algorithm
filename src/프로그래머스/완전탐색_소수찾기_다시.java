package 프로그래머스;

import java.util.ArrayList;

public class 완전탐색_소수찾기_다시 {
    /**
     * 1. DFS 이용
     * 1-1. 종료조건있어야함 (종료조건병확, 경우의 수를 살펴야하는 경우DFS쓴다.깊이탐색
     * 1-2. 재귀함수로 자기 자신 출력 (해서 반복!
     * 2. 체크리스트 이용
     * 3.
     */


    public static void main(String[] args) {
        String numbers = "17";

        solution(numbers);
    }

    static ArrayList<Integer> result = new ArrayList<>();

    static boolean[] checkList = new boolean[7];
    public static int count = 0;

    //소수 검증
    public static boolean isPrime(int num) {
        if (num == 0) return false;
        if (num == 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int solution(String numbers) {

        String temp = "";
        for (int i = 1; i <= numbers.length(); i++) {
            rec(numbers, temp, i);
        }
        return count;

    }


    //순열하는 메서드입니다~!~!~!
    public static void rec(String numbers, String temp, int len) {
        //DFS 종료해야하는 시점 지정!
        //종료하는 타이밍 순회해야할 댑스를 도달함!
        //len는 구하려는 자릿수 , temp는 만든 자릿수- 일치하면 추가함~!
        if (temp.length() == len) {
            //종료할 때: 만든 숫자temp가 result에 없는 값이면
            if (!result.contains(Integer.parseInt(temp))) {
                System.out.println("temp:add:" + temp);
                //추가
                result.add(Integer.parseInt(temp));
                //소수인지 검증했는데 소수가 맞으면 횟수 증가
                if (isPrime(Integer.parseInt(temp)))
                    count++;
            }
            return;
        }

        //받은 numbers로 문자를 만들자
        for (int j = 0; j < numbers.length(); j++) {
            if (checkList[j]) continue;
            temp += numbers.charAt(j);
//            System.out.println("temp" + temp);
            //썼다고 체크
            checkList[j] = true;
            //재귀
            rec(numbers, temp, len);
//            System.out.println("temp" + temp);
            //다시 초기화
            checkList[j] = false;
            //왜 1을 빼지??
            temp = temp.substring(0, temp.length() - 1);
//            System.out.println("temp" + temp);


        }


    }


}
