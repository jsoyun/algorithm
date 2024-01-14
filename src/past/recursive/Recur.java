package past.recursive;


import java.util.Scanner;

public class Recur {

    //재귀 함수
    static void recur(int n){
        //재귀 호출을 2번 실행하고 있음
        //재귀호출 여러번 실행하는 메서드를 순쉬 재귀라고 한다.
        if (n >0){
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }
    }


    static void recur2(int n){
        //재귀 호출을 2번 실행하고 있음
        //재귀호출 여러번 실행하는 메서드를 순쉬 재귀라고 한다.
        if (n >0){
            recur2(n-2);
            System.out.println(n);
            recur2(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int x = stdin.nextInt();
        recur2(x);

    }
}
