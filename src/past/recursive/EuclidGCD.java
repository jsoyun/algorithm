package past.recursive;

import java.util.Scanner;


public class EuclidGCD {
    static int gcd(int x, int y){
        System.out.println("x"+x);
        System.out.println("y"+y);
        if(y==0)
            return x; //최대공약수는 0이 아닌 다른 수가 됨
        else{
            System.out.println("x%y"+x%y);
            return gcd(y, x%y);
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("정수x를 입력하세요:" ); int x = stdin.nextInt();

        System.out.print("정수y를 입력하세요:" ); int y = stdin.nextInt();
        System.out.println("최대공약수는" + gcd(x,y) +"입니다.");

    }
}
