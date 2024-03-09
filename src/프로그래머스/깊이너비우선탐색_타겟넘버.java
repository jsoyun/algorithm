package 프로그래머스;

public class 깊이너비우선탐색_타겟넘버 {

    public static void main(String[] args) {
        int numbers[] = {4, 1, 2, 1};
        int target = 4;
        solution(numbers, target);
    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        System.out.println("answer" + answer);
        return answer;
    }

    static int dfs(int[] numbers, int index, int sum, int target) {
        if (index == numbers.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers, index + 1, sum + numbers[index], target) + dfs(numbers, index + 1, sum - numbers[index], target);

    }

}
