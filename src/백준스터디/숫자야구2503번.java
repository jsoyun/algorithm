package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자야구2503번 {

    //영수가 말한 수 324
    //민혁이가 말한 수 123
    //영수에게 물었을 때 몇 스트라이크 몇 볼인지 답

    // 동일한 위치 같은 수 1개면 스트라이크 1개.
    // 숫자가 있긴 하나 다른 위치에 있으면 볼 1번

    //민혁이가 영수의 세 자리수를 정확히 맞추어 3스트라이크가 되면 게임 끝
    //아니면 민혁 새로운 수 도출해서 묻기 반복

    //TODO: 영수가 생각하고 있을 가능성이 있는 수가 총 몇 개인지 맞추기
    // 전체를 순회하면서 - 완전 탐색으로 푸는 문제
    // 답으로 예상되는 모든 숫자들을 입력받은 숫자들과 비교하여 얻은 값이 입력받은 숫자와 같으면  살리고 아니면 제외
    // 3자리, 자리수와 값을 비교!
    // 자리수와 값이 모두 같다면 스트라이크, 자리수는 다른데 값이 같다면 볼 증가

    static int N;
    static boolean[] check = new boolean[1000];

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());


        //가능한 정답은 check배열을 true, 아니면 false;
        for (int i = 123; i < 1000; i++) {
            String str = Integer.toString(i);
            if (str.charAt(0) == '0' || str.charAt(1) == '0' || str.charAt(2) == '0') continue;
            if (str.charAt(0) == str.charAt(1) || str.charAt(1) == str.charAt(2) || str.charAt(0) == str.charAt(2))
                continue;


        }


        for (int i = 0; i < N; i++) {
            String string = bufferedReader.readLine();
            StringTokenizer st = new StringTokenizer(string);
            int req = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            //예상가능한 모든 정답을 탐색
            for (int answer = 123; answer < 1000; answer++) {
                //만약 정답 가능성이 있다.
                if (check[answer]) {
                    int ns = 0;
                    int nb = 0;
                    //정답 가능성이 있는 수와 입력받은 수와 스트라이크와 볼 비교
                    // 이때 입력받은 수와 정답가능성 있는 수를 각각 반복문 돌려서 각 자리수와 값을 비교한다 .
                    for (int first = 0; first < 3; first++) {

                        for (int second = 0; second < 3; second++) {

                        }
                    }
                    //입력받은 스트라이크, 볼 값과 계산한 값이 같다면 정답 가능성이 있는 수
                    if (ns == s && nb == b) check[answer] = true;
                        //아니라면 제외
                    else check[answer] = false;
                }

            }

        }

        //정답 가능성이 있는 수를 세서 카운트 및 출력
        int answer = 0;
        for (int i = 123; i < 1000; i++) {
            if (check[i]) answer++;
        }

        System.out.println(answer);

    }

}
