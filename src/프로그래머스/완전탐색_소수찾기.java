package 프로그래머스;

import java.util.ArrayList;
import java.util.HashSet;

public class 완전탐색_소수찾기 {
    public static void main(String[] args) {

        String numbers = "17";
        solution(numbers);


    }


    public static String[] arr;
    public static int count = 0;
    static boolean[] check = new boolean[7];
    static ArrayList<Integer> arr2 = new ArrayList<>();

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
        // 2. 몇 자리의 수를 만들 지에 대한 반복, 011의 경우 1~3자리의 다양한 숫자 조합이 가능.
        for (int i = 1; i <= numbers.length(); i++) {
            rec(numbers, temp, i);
        }

        return count;
    }

    public static void rec(String numbers, String temp, int len) {


        if (temp.length() == len) {
            // 12. ArrayList에 이미 존재하는 값인지를 확인해 중복값 삽입을 방지.
            if (!arr2.contains(Integer.parseInt(temp))) {
                System.out.println("temp" + temp);
                arr2.add(Integer.parseInt(temp));
                if (isPrime(Integer.parseInt(temp)))
                    count++;
            }
            return;
        }
        // 4. n으로 전달 된 numbers를 탐색.
        for (int j = 0; j < numbers.length(); j++) {
            // 5. 이미 방문한 인덱스면 패스.
            if (check[j]) continue;
            // 6. 임시 변수 temp에 붙여나가며 숫자를 조합.
            temp += numbers.charAt(j);
            // 7. temp에 붙였기 때문에 방문처리.
            check[j] = true;
            // 8. 재귀, 앞서 붙인 temp변수와 현                                                                                               재 몇 자리의 수를 만드는지에 대한 정보인 len 변수를 전달.
            rec(numbers, temp, len);
            // 9. 조합이 완료되면 직전의 방문처리한 인덱스를 false로 변경.
            check[j] = false;

            // 10. temp 변수에서 마지막 자리의 숫자를 제외하고 갱신.
            temp = temp.substring(0, temp.length() - 1);

        }
    }
    
}
