package 프로그래머스;

public class 완전탐색_최소직사각형 {
    public static void main(String[] args) {
        int[][] sizes =
                {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int f = solution(sizes);
    }


    private static int solution(int[][] sizes) {

        int m = 0;

        int n = 0;


        for (int i = 0; i < sizes.length; i++) {
            m = Math.max(m, Math.max(sizes[i][0], sizes[i][1]));
            n = Math.max(n, Math.min(sizes[i][0], sizes[i][1]));

        }

        int answer = m * n;
        return answer;
    }


//    class Solution {
//        public int solution(int[][] sizes) {
//
//            int m = 0;
//
//            int n= 0;
//
//            int max =0;
//            int not_max =0;
//
//
//            for(int i=0; i<sizes.length ; i++){
//                m=  Math.max(sizes[i][0]);
//                n=Math.min(sizes[i][1])  ;
//
//            }
//            System.out.println(m);
//            System.out.println(n);
//
//
//
//
//            for(int i=0; i<sizes.length ; i++){
//                if (m <first[i]) {
//                    m = first[i];
//
//                }
//
//                if (n <second[i]) {
//                    n = second[i];
//
//                }
//
//            }
//
//
//            if(m >n ){
//                max = m;
//                for(int i=0; i<sizes.length; i++){
//                    if(second[i] > first[i]){
//                        second[i] = first[i];
//
//
//                    }
//                    if (  not_max <second[i]){
//                        not_max =second[i];
//                    }
//
//                }
//
//
//            } else{
//                max =n;
//                for(int i=0; i<sizes.length; i++){
//                    if(first[i] > second[i]){
//                        first[i] = second[i];
//
//
//                    }
//                    if (  not_max <first[i]){
//                        not_max =first[i];
//                    }
//
//                }
//            }
//
//            int answer = max *not_max;
//            return answer;
//        }
//    }
}
