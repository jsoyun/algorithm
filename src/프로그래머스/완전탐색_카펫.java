package 프로그래머스;

public class 완전탐색_카펫 {
    /**
     * x*y =yellow
     * brown = (x+2) *2 + (y+2) *2 -4
     * = 2x + 2y +4
     * x+y = (brown -4) -4
     *
     */
}

class Solution {
    public int[] solution(int brown, int yellow) {
        int x = 0, y = 0;
        for (y = 1; y <= yellow; y++) {
            x = yellow / y;
            if (y * x != yellow) {
                continue;
            }

            if ((x + y) == ((brown / 2) - 2)) {
                break;
            }

        }

        int[] answer = {x + 2, y + 2};
        return answer;
    }
}
