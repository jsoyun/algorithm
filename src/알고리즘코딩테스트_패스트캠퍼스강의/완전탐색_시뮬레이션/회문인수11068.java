package 알고리즘코딩테스트_패스트캠퍼스강의.완전탐색_시뮬레이션;

import java.util.Scanner;

public class 회문인수11068 {

    public static int[] convertBase(int x, int B) {
        //딱맞는 길이로 나타낸다.
        int len = 0, copyX = x;
        while (x > 0) {
            x /= B;
            len++;
        }
        int[] digit = new int[len];
        len = 0;
        while (x > 0) {
            //나머지값이 자릿수가 된다
            digit[len++] = x % B;
            //다음 자릿수를 구하기 위해서
            x = x / B;

        }
        return digit;
    }

    public static boolean isPalindrome(int[] digit) {
        for (int i = 0; i < digit.length / 2; i++) {
            if (digit[i] != digit[digit.length - i - 1]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        //문제: 하나의 숫자를 모든 진법으로 표현했을 때 회문이 될 수 있는가?

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int x = sc.nextInt();
            boolean answer = false;
            for (int i = 2; i <= 64; i++) {
                int[] digit = convertBase(x, i);
                if (isPalindrome(digit)) {
                    answer = true;
                    break;

                }
            }
            System.out.println(answer ? "1" : "0");
        }

        //어떤 수를 왼쪽으로 읽어도
        //오른쪽 읽어도 같을 때
        // 회문수 747 ,
        //255 도 회문인 수 - 16진수로 표현하면 FF
        //양의 정수 입력받았을때 이 수가 어떤 B진법 2<= B<= 64로 표현하면 회문이 되는 경우가 있는지 알려주는 프로그램을 작성하라
        //B진법이란 한자리에서 수를 표현할 때 쓸 수 있는 수의 가짓수가 B라는 뜻
        //십진법은 B 10

        // 수 자체로 회문
        // 다른 진수로 표현했을 때 회문인지
        // 출력은 표준출력을 사용한다. 주어진 수가 어떤 진법으로 표현하여 회문이 될 수 있다면 1,
        // 그렇지 않다면 0을 출력한다

        // 3 -> 3진법
        // 747 ->
        // 255 ->

        //문제: 하나의 숫자를 모든 진법으로 표현했을 때 회문이 될 수 있는가?
        //1. 가능한 모든 진법에 대해 진법을 변환한다
        //2. 변환된 수가 회문이 될 수 있는지 확인한다
//        boolean answer = false;
//        //진법을 모두 돌면서ㅍ
//        for (int i = 2; i <= 64; i++) {
//            //x를 i진법에 대해서 컨버트를 하고
//            int[] baseDigit = convertBase(x, i);
//            // 그 자릿값이 회문인지 확인
//            if (isPalindrome(baseDigit)) {
//                answer = true;
//                break;
//            }
//        }
//
//        //진법 변환하는 코드 - 1. 가능한 모든 진법에 대해 진법을 변환한다
//        public static int[] convertBase(int x, int base){
//            ///나올 수 있는  최대칸 왜 20자리냐 - 문제입력 100만이 들어오고 이때 가장 긴 값은 이 백만을 2진법으로 나타냈을때
//            //그러면 2의 20승이 백만을 조금 넘어가니까 자릿수 충분하다고 봄
//            //나올 수 있는  최대칸
//            int[] reverseDigit = new int[20];
//            int len =0;
//            while(x > 0){
//                reverseDigit[len++] = x%base;
//                x = x/base;
//
//            }
//            return reverseDigit; //자릿값 배열
//        }
//        //2. 변환된 수가 회문이 될 수 있는지 확인한다.
//        //가운데를 기점으로 대칭되는 부분이 값이 같은지 확인
//        public static boolean isPalindrome(int[] digit){
//            for (int i=0; i<digit.length /2; i++){
//                if(digit[i] != digit[digit.length -i-1]){
//                    return false;
//                }
//
//            }
//            return true;
//        }
//
//
//
//
//        //바뀐 내용 토대로 수정
//        boolean answer = false;
//        //진법을 모두 돌면서ㅍ
//        for (int i = 2; i <= 64; i++) {
//            //x를 i진법에 대해서 컨버트를 하고
//            int[] baseDigit = new int[20];
//            //baseDigit 를 구할때 딱 배열이 얼마나 생성되는지 정확히 구하면 길이를 전달하지 않아도
//            int baseLength = convertBase(x,i,baseDigit);
//            // 그 자릿값이 회문인지 확인
//            if (isPalindrome(baseDigit)) {
//                answer = true;
//                break;
//            }
//        }
//
//        //reverseDigit; //자릿값 배열이 우리가 구하는 자릿수만큼 딱있는게 아니라
//        // 우리는 지금 20칸에 맞춰져 있음
//        //그래서 isPalindrome함수에서 digit의 length까지보면 비어있는 값까지 다 보게 됨
//
//        //이걸 방지하기 위해서 자릿값 만들어서 리턴하는 것 대신에
//        //reverseDigit 길이를 삽입해서 사용
//        public static int[] convertBase(int x, int base, int[] reverseDigit){
//            ///나올 수 있는  최대칸 왜 20자리냐 - 문제입력 100만이 들어오고 이때 가장 긴 값은 이 백만을 2진법으로 나타냈을때
//            //그러면 2의 20승이 백만을 조금 넘어가니까 자릿수 충분하다고 봄
//            //나올 수 있는  최대칸
//
//            int len =0;
//            while(x > 0){
//                reverseDigit[len++] = x%base;
//                x = x/base;
//
//            }
//            return len;
//        }
//        //digit이 아닌 실제 길이에서
//
//        public static boolean isPalindrome(int[] digit, int length){
//            for (int i=0; i< length /2; i++){
//                if(digit[i] != digit[digit.length -i-1]){
//                    return false;
//                }
//
//            }
//            return true;
//        }


    }
}
