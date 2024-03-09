package 프로그래머스;

public class 깊이너비우선탐색_네트워크 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int n = 3;  //컴퓨터의 갯수
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        solution(n, computers);
    }

    public static int solution(int computer_len, int[][] computers) {
        int answer = 0;
        boolean[] chk = new boolean[computer_len];
        for (int i = 0; i < computer_len; i++) {
            if (!chk[i]) {
                dfs(computers, chk, i);
                //answer dfs 깊이 탐색끝나면 answer추가됨 , 탐색시 연결되어있는애면 1이면, chk를 true해줌 anwer추가 안됨
                //chk가 false면 아직 방문안해서 깊이 탐색 시작. 내부적으로 탐색하면서 연결되어있는 애들 true로 방문했다고 해줌. 탐색끝나면 answer++
                answer++;
            }
        }

        return answer;

    }

    static void dfs(int[][] computers, boolean[] chk, int start_index) {
        chk[start_index] = true;
        for (int i = 0; i < computers.length; i++) {
            if (computers[start_index][i] == 1 && !chk[i]) {
                dfs(computers, chk, i);

            }
        }

    }


}
