package 리트코드;

import java.util.ArrayList;
import java.util.List;

public class MostVisitedSectorInACircularTrack1560 {

    //    https://algo.monster/liteproblems/1560
    public static void main(String[] args) {
        int n = 4;
        int[] rounds = {1, 3, 1, 2};
        Solution875 solution = new Solution875();
//        List<Integer> integers = solution.mostVisited(n, rounds);

//        System.out.println(integers);
    }


}

class Solution {
    public List<Integer> mostVisited(int sectors, int[] rounds) {
        // The final round (m is now finalRoundIndex for clarity)
        int finalRoundIndex = rounds.length - 1;
        // List to store the most visited sectors
        List<Integer> mostVisitedSectors = new ArrayList<>();

        // If the first round is less than or equals to the last round, it means the path doesn't cross sector 1
        if (rounds[0] <= rounds[finalRoundIndex]) {
            // Iterate from start sector to end sector and add to the list
            for (int i = rounds[0]; i <= rounds[finalRoundIndex]; ++i) {
                mostVisitedSectors.add(i);
            }
        } else { // The path crosses sector 1
            // Add sectors from 1 to the final round's sector
            for (int i = 1; i <= rounds[finalRoundIndex]; ++i) {
                mostVisitedSectors.add(i);
            }
            // Add sectors from the starting round's sector to the last sector (wrapping around)
            for (int i = rounds[0]; i <= sectors; ++i) {
                mostVisitedSectors.add(i);
            }
        }

        // Return the list of most visited sectors
        return mostVisitedSectors;
    }
}

//class Solution {
//    public List<Integer> mostVisited(int n, int[] rounds) {
//
//        //n 트랙갯수
//        //rounds 라운드 노드
//        int i = 0;
//
//        //check
//        int[] check = new int[n];
//
//        //가장 많이 방문한 횟수 출력하기
//        ArrayList<Integer> answer = new ArrayList();
//
//
//        int last = rounds[rounds.length - 1];
//
//        if (rounds[i] <= rounds[i + 1]) {
////            if (i + 1 > rounds.length - 1) {
////
////            }
//            for (int j = rounds[i] - 1; j < rounds[i + 1]; j++) {
//                check[j]++;
//
//            }
//
//        } else if (rounds[i] > rounds[i + 1]) {
//            for (int j = rounds[i + 1]; j < rounds[i]; j++) {
//                check[j]++;
//            }
//
//
//        }
//
//        return answer;
//
//    }
//
//
//}
