package 프로그래머스;

public class 완전탐색소수찾기_다시solution {
    //코드 그대로
//    import java.util.ArrayList;
//
//    class Solution  {
//        static boolean[] checkList = new boolean[7];
//
//
//        static ArrayList<Integer> result = new ArrayList();
//        static int count =0;
//
//
//        public static int solution(String numbers){
//            String temp ="";
//
//            for (int i=1; i<= numbers.length(); i++){
//                make(numbers, temp, i);
//
//            }
//            return count;
//        }
//
//        public static boolean isPrime(int number){
//            if (number == 0) return false;
//            if (number == 1) return false;
//            for (int i =2; i*i<= number; i++){
//                if (number % i ==0) return false;
//
//            }
//            return true;
//
//
//        }
//
//        public static void make(String numbers, String temp, int len){
//
//            if (temp.length() == len){
//
//                if (!result.contains(Integer.parseInt(temp))){
//                    result.add(Integer.parseInt(temp));
//                    if(isPrime(Integer.parseInt(temp))){
//                        count++;
//                    }
//                }
//
//
//                return;
//
//            }
//
//            for (int i=0; i< numbers.length(); i++ ){
//                if(checkList[i]) continue;
//                temp += numbers.charAt(i);
//                checkList[i] = true;
//                make(numbers, temp, len); //len로 동일!
//                checkList[i] = false;
//                temp = temp.substring(0, temp.length()-1);
//
//            }
//
//
//
//
//
//        }
//
//
//
//    }
}
