package 프로그래머스.해시;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 전화번호목록 {
    //한 번호가 다른 번호의 접두어인 경우가 있는지 확인

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
//        String[] phone_book = {"123", "456", "789"};

        전화번호목록 전화번호목록 = new 전화번호목록();
        boolean solution = 전화번호목록.solution(phone_book);
        System.out.println("solution = " + solution);

    }

    public boolean solution(String[] phone_book) {

        //방법 1 sort/loop로 푸는 방법
//        Arrays.sort(phone_book);
//
//        for (int i = 0; i < phone_book.length - 1; i++)
//            if (phone_book[i + 1].startsWith(phone_book[i]))
//                return false;
//
//
//        return true;

        //방법 2 Hash를 사용한 방법
        //의문 - 자기자신 나와서 false되지 않나?
        //이해함 -> substring(0,phone_book[i].length()-1)여서 자기자신보다 하나부족하게 조회됨 자기자신을 조회할 수 없음
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                System.out.println("phone_book[i].substring(0, j) = " + phone_book[i].substring(0, j));
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    System.out.println(" result= " + false);

                    return false;
                }

            }
        }
        return true;


        //오늘배운 것은 startswith과 substring
    }
}
