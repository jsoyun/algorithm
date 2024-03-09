package 프로그래머스;

public class 완전탐색_피로도 {
    public static void main(String[] args) {
        new Solution();

    }

    //내 코드는 통과 못함!!
//    static int count = 0;
//    static boolean[] checkList = new boolean[8];
//
//    public int solution(int k, int[][] dungeons) {
//
//
//        for (int i = 0; i < dungeons.length; i++) {
//            check(k, i, dungeons);
//        }
//
//
//        return count;
//
//    }
//
//    public static void check(int tired, int d_length, int[][] dungeons) {
//        if (checkList[d_length]) return;
//        if (count == dungeons.length) {
//            return;
//        }
//        ;
//        if (tired < dungeons[d_length][0]) {
//            return;
//        } else {
//            tired = tired - dungeons[d_length][1];
//            count++;
//
//
//        }
//
//        for (int i = 1; i < dungeons.length; i++) {
//            checkList[d_length] = true;
//            check(tired, i, dungeons);
//            checkList[d_length] = false;
//        }
//
//    }


}




