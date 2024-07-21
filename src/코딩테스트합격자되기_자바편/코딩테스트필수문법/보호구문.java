package 코딩테스트합격자되기_자바편.코딩테스트필수문법;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 보호구문 {
//    static double calculateAverage(List<Integer> numbers) {
//
//    }

    //제네릭
    public static void main(String[] args) {
        int[] d = {1};
        int[] dfdf = new int[1];
        List list = new ArrayList();
        list.add(10);
        list.add("adbasd");

        //런타임 오류 발생하는 이유 String타입을 int타입으로 직접 캐스팅할 수 없기 때문에 예외 발생
        int sum1 = (int) list.get(0) + (int) list.get(1);
        System.out.println("sum1 = " + sum1);

        //list를 정의할 때 <Integer> 와 같이 타입을 강제하는 것이 제네릭이다.
        //제네릭은 타입에 맞지 않는 데이터를 추가하려고 할 때 문법 오류를 발생시켜 개발자의 실수를 방지해준다.
        List<Integer> genericList = new ArrayList<>();
        genericList.add(10);
//        genericList.add("abc"); //문법 (빌드 레벨) 오류 발생ㅋ/ㅌ

        HashMap<Integer, Integer> check = new HashMap<>();


    }
}
