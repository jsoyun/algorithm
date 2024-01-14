package past.recursive;


import java.io.IOException;

import java.util.Scanner;

public class recur3{

   static int cnt =0;
    public static int recursion(String s, int l, int r){
        cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args) throws IOException {
        //인풋을 받아야함

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n =0;
//        n = Integer.parseInt(br.readLine());

//        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
//        String st ="";
//        st = br2.readLine();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        //몇번해야하냐면 n번만큼 해야함 인풋 받은 값으로

        for(int i=0; i<n; i++){
            //인풋받은 문자열 k
//            isPalindrome(st);
            System.out.println("st"+isPalindrome(sc.next())+ "cnt"+cnt);
            cnt =0;

        }
        sc.close();

    }
}
