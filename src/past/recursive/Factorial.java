package past.recursive;

import java.util.Scanner;
public class Factorial {

    //음이 아닌 정수 n의 팩토리얼 값을 반환
    public static int factorial(int n){
//        if (n >0){
//            return n * factorial(n-1);
//        }
//        else{
//            return 1;
//        }

        //위 코드를 조건 연산자 써서 한줄로 표기하면
        return (n>0) ? n* factorial(n-1) :1;
    }

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        System.out.println("정수를 입력하세요:" );
        int x = stdin.nextInt();
        System.out.println(x +"의 팩토리얼은" + factorial(x) + "입니다");
    }
}
