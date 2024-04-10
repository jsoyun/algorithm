package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 국회의원선거1417번 {

    //후보 N명
    //1번찍으려는 사람수
    //2번
    //
    //주민 M명

    //다솜이 기호 1번

    //출력 다솜이가 매수해야하는 사람의 최솟값

    //목표는 당선임
    //가장 표가 많아야함! -> 가장 표가 많은 사람 거를 뺏어서 자기 표가 가장 많으면 됨

    //TODO: 뺏어야하는 값이 최소값이군!! -> 막힌 이유: 나는 중간값을 구해서 한번에 비교값을 구하려고 했었음 근데 최대값을 어떻게 계속 구할지가 고민

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int answer = 0;

        int maxindex = 0;
        int maxValue = 0;
        for (int i = 0; i < N; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxindex = i;
            }
        }
        System.out.println("maxindex = " + maxindex);
        System.out.println("maxValue = " + maxValue);

        //5 , 7  ==> 5+7 은 12임. 12를 2로 나누면 6이 나온다. 6 6은 똑같음. 하나를 뺏고 다른 쪽에 두면
        // 6, 6 이 된다. 1을 하나씩 나눠가짐
//        근데 max랑 같은 값 7이 있으면 1하나가져감.

        // 7-5 =2
        // 5+2 =7, 7-2 =5

        //10 , 10 ==> 20 /2 10이 나옴  10 -10은 0임. 0인 경우 1...
        //10 -10 = 0 0이면 1만!

        //1 후보가 한명이면 0!

        //5 10  ===> 15/2 하면 홀수면 +1한 값.. 7정도..?  7 7+1 -> 7, 8
        //값에서8-5 =3
        //8 7 로 만들어 놨음.
        //근데 8이 max가 맞는지 확인!  TODO: 전체값중에 max인지 여부 계속 획인..
        //8 7 7 3 8 // 첫번째보다 같거나 큰 애 있으면 처리.. // 같으면 1추가~

        if (array[0] == maxValue) {
            answer = answer + 1;
        }
        // 10 10 1 1
        //

        int same = (array[0] + maxValue) / 2;
        //6임.
        // 6 - array[0]5 = 1

        if ((array[0] + maxValue) % 2 == 1) {
            same++;
        }
        answer += same - array[0]; // answer = 6 -5 /1

        array[0] = same; // 6
        array[maxindex] = 0;  // 6 0 7
        //다시 최댓값 구하기

//        for (int i = 0; i < N; i++) {
//            if (array[i] > maxValue) {
//                maxValue = array[i];
//                maxindex = i;
//            }
//        }
        //이번에는 6 7  ==> 13 / 2 -> 6이 나옴


        //3 10
        // 10 -3 = 7 //본인값보다 큼.. 7을 6으로 한다면  5로 한다면 4로 한다면
        // 3+ 7 = 10, 10- 7 =3      // 9,4     //8,5  //7, 6

        //4 12 ==> 16으로 하고  2를 나눔 8이 나와요. 둘이 똑같은 값이되려면 8이 되어야하는데!
        // 12 - 4 = 8
        // 8 8

    }
}
