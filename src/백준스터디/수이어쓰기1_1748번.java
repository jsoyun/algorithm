package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수이어쓰기1_1748번 {
    public static void main(String[] args) throws IOException {
        //자릿수 구하기
        //12345 ->5
        //123456789 101112131415 //9+12 -> 21
        //120
        //1~9 일의자리 1개자릿수, 10~99십의자리 두자릿수, 100~120 백의자리 세자릿수
        //갯수는 끝 - 시작 +1
        //일의 자릿수 갯수 : 9 *1 , 90*2 , 21*3 = 9 + 180 + 63 =252
        //자릿수 10으로 나눠?

        //입력N
        //출력:1부터 N까지의 수를 이어썼을때의 자릿수 구하기
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int result = 0, len = 1;
        int end = 9, start = 1;

        //자릿수를 어떻게 구하지..
        //시작점  - 끝점 +1
        //일의 자리 1~9 -> 마지막 값이 9
        //다음 시작값= 마지막값+1
        //다음 끝값 = N의 값이 100보다 작으면 (N-시작점 +1 ) *N의 길이
        //자릿수는 다음시작값의 길이

        //1~9 1자리
        //10~99 2자리
        // 100~999 3자리
        //N = 1800 이변 1000~ 1400

        while (N > end) {
            result += (end - start + 1) * len; // 1~9
            len++; //1자리에서 2자리로. 근데 len가 추가되는 기준이 왜 N > end일까???
            start *= 10; //처음 값은 start 1로 풀고 그 다음 start가 10부터 시작.
            end = end * 10 + 9; //처음 end는 9로 풀고 그 다음에는 99. //아 99보다 크면 세 자리수구나 그래서 len++

        }

        //만약 N이 end와 같거나 N보다 end가 크다면? N자체가 마지막 값이기 때문에
        //다음 자리수로 넘어가지 않고 계산
        result += (N - start + 1) * len;
        System.out.println(result);
        bufferedReader.close();


    }
}
