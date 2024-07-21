package 알고리즘코딩테스트_패스트캠퍼스강의.완전탐색_시뮬레이션;

import java.util.Scanner;

public class 진법변환2 {
    //10진법 수 N
    //이 수를 B진법으로 바꿔 출력하는 프로그램 작성
    //10진법 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있음
    //A: 10, B:11 이렇게 알파벳 대문자를 사용한다

    //입력
    //첫째 줄에 N과 B가 주어진다.
    //2<= B <= 36
    //N은 10억보다 작거나 같은 자연수다
    //36진법으로 출력..
    // 36으로 다섯번은 나눠야함
    // A 10 J20  T 30 Z 36

//    어떻게 풒까
    //10전까지는 그냥 수로 나타냄
    // 10이후부터는 A~부터 나타낸다

    //60466175 = ZZZZZ(36)
    // 1000000000 = GJDGXS(36)
    //  1000000000 =


//    1. X를B로 나눈 나머지를 구하고, B로 나눈다.
//            0이 될때까지 반복한다.
//
//        2. 가장 마지막 나머지부터 가장 앞 자릿값이 된다.
    //10진법 N을 B진법으로 변환하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        //1. N을 B로 나눈 나머지를 구하고 B로 나누자
        //2. 이때 가장 마지막 나머지부터 가장 앞 자릿값이 도니다.

        String answer = ""; //여기 매번 자릿값 기록해줌
        while (N > 0) {
            int digit = N % B; //N을 B로 나눈 나머지 값
            if (digit < 10) answer += digit;
            else answer += (char) ('A' + digit - 10);
            N /= B; //N을 B로 나눈 몫으로 바꿔줌 N = N /B

        }
        for (int i = answer.length() - 1; i >= 0; i--) { //answer을 거꾸로 순회하면서 출력
            System.out.print(answer.charAt(i));
        }
        System.out.println();
    }

}
