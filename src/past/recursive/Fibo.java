package past.recursive;

//import io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibo {
    public static int fibo(int n){
        if(n==1) return 1;
        else if(n==0) return 0;
        else return fibo(n-1) + fibo(n-2);

    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        br.close();
        System.out.println(fibo(x));

    }

}
