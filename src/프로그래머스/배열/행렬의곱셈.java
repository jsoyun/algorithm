package 프로그래머스.배열;

public class 행렬의곱셈 {


    public int[][] solution(int[][] arr1, int[][] arr2) {


        //답
//        int r1 = arr1.length;
//        int c1 = arr1[0].length;
//        int r2 = arr2.length;
//        int c2 = arr2[0].length;
//
//        int[][] answer = new int[r1][c2];
//
//        //
//        for (int i = 0; i < r1; i++) {
//            for (int j = 0; j < c2; j++) {
//                for (int k = 0; k < c1; k++) {
//                    answer[i][j] += arr1[i][k] * arr2[k][j];
//                }
//            }
//        }

        ///헹렬의 곱셈이
        // 첫번째의 행의 길이, 두번째의 열길이 만큼 답이 나옴 3x3 이랑 2x2 를 하면
        // 이때

        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int row = 0; row < arr1.length; row++) {

            for (int column = 0; column < arr2[0].length; column++) {
                //row 0
                //column 0
                //k만큼 반복해서 더함
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[row][column] += arr1[row][k] * arr2[k][column];
//                    System.out.println("    answer[row][column] = " + answer[row][column]);
//                    System.out.println("   arr1[row][column] * arr2[column][row] = " + arr1[row][column] * arr2[column][row]);


                }

            }

        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println();
            for (int j = 0; j < answer[0].length; j++) {
                System.out.print(answer[i][j]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        행렬의곱셈 행렬의곱셈 = new 행렬의곱셈();

//        int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
//        int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};

        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        행렬의곱셈.solution(arr1, arr2);


    }


}
