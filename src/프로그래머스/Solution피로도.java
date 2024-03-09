package 프로그래머스;

public class Solution피로도 {
    static int answer = 0;
    static boolean[] checkList;

    public static void main(String[] args) {
        Solution피로도 solution = new Solution피로도();
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        int result = solution.solution(k, dungeons);
        System.out.println("Result: " + result);
    }

    public int solution(int k, int[][] dungeons) {
        checkList = new boolean[dungeons.length];

        check(k, 0, dungeons);


        return answer;

    }

    public static void check(int tired, int count, int[][] dungeons) {
        System.out.print("check tired:" + tired);
        for (int i = 0; i < dungeons.length; i++) {

            if (!checkList[i] && dungeons[i][0] <= tired) {

                checkList[i] = true;
//                tired = tired - dungeons[i][1];
                // System.out.print("tired:"+tired);
                check(tired - dungeons[i][1], count + 1, dungeons);
                checkList[i] = false;
            }


        }
        System.out.println("answer:" + answer);
        System.out.println("count:" + count);

        answer = Math.max(answer, count);  //1,2 중에 최대값 2가 받았다는 건데..

    }

}
