package 리트코드;

public class CountUnhappy1583 {
    public static void main(String[] args) {
//        int n = 4;
//        int[][] preferences = {{1, 2, 3}, {3, 2, 0}, {3, 1, 0}, {1, 2, 0}};
//        int[][] pairs = {{0, 1}, {2, 3}};


        int n = 2;
        int[][] preferences = {{1}, {0}};
        int[][] pairs = {{1, 0}};


//        int n = 4;
//        int[][] preferences = {{1, 3, 2}, {2, 3, 0}, {1, 3, 0}, {0, 2, 1}};
//        int[][] pairs = {{1, 3}, {0, 2}};


        Main solution = new Main();
        solution.unhappyFriends(n, preferences, pairs);
    }
}

class Main {


    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int answer = 0;
        int[] check = new int[n];

        for (int i = 0; i < n / 2; i++) {
            int first = pairs[i][0]; //0
            int second = pairs[i][1]; //1

            if (preferences[first][0] != second) {
                check[first] = 0;

            } else {
                check[first] = 1;
            }


        }


        for (int i = 0; i < check.length; i++) {
            System.out.println(check[i]);
            if (check[i] == 0) {
                answer++;
            }
        }
        System.out.println(answer);
        return answer;


    }
}