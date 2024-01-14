package 코테입문;

public class 문자열안에문자열 {

    static String str1 = "ab6CDE443fgh22iJKlmn1o";
    //        String str1 = "ppprrrogrammers";
    static String str2 = "6jkCjkD";
//        String Str2 = "pppp";

    public static int solution(String str1, String str2) {
        if (str1.contains(str2)) {
            System.out.println("str1 = " + 1);

            return 1;
        } else {
            System.out.println("str2 = " + 2);

            return 2;
        }

    }

    public static void main(String[] args) {


        solution(str1, str2);

//        return 0;
    }

}
