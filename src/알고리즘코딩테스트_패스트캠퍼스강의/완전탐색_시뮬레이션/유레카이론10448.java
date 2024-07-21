package 알고리즘코딩테스트_패스트캠퍼스강의.완전탐색_시뮬레이션;

import java.util.Scanner;

public class 유레카이론10448 {

    static boolean[] isEurekaNumber = new boolean[1001];

    public static void preprocess() {
        //삼각수 담은 트라이앵글 만들어
        int[] triangleNumbers = new int[50];
        int triangleNumberCount = 0;
        for (int i = 1; ; i++) {
            int triangleNumber = i * (i + 1) / 2;
            if (triangleNumber >= 1000) break;
            triangleNumbers[triangleNumberCount++] = triangleNumber;

        }
        boolean[] isSumOfTriangle = new boolean[1001];

        for (int i = 0; i < triangleNumberCount; i++) {
            for (int j = 0; j < triangleNumberCount; j++) {
                if (triangleNumbers[i] + triangleNumbers[j] <= 1000) {
                    int sum = triangleNumbers[i] + triangleNumbers[j];

                    //둘이 더한 값으로 인덱스를 쓰는 이유가 뭐징
                    //어차피 순회할거라서 그런가보네
                    if (sum < 1000) isSumOfTriangle[triangleNumbers[i] + triangleNumbers[j]] = true;
                }
            }
        }

        //두개의 합으로 이루어진 트라이앵글에서
        for (int i = 1; i < 1000; i++) {
            //두개의 합으로는 나타낼 수 있는 수가 아니라면 continue;
            if (!isSumOfTriangle[i]) continue;
            for (int j = 0; j < triangleNumberCount; j++) {
                int sum = i + triangleNumbers[j];
                if (sum <= 1000) isEurekaNumber[sum] = true;
            }
        }

        //테스트케이스마다 매번 구할 필요 있나?
        // 이전에 구한 값은 불변값이지 변하지 않음 -> 한번만 구해놓고 재사용하자
//        triangleNumberCount = getTriangleNumbers(triangleNumbers, 1000);


//        for (int i = 0; i < triangleNumberCount; i++) {
//            for (int j = 0; j < triangleNumberCount; j++) {
//                for (int k = 0; k < triangleNumberCount; k++) {
//                    int sum = triangleNumbers[i] + triangleNumbers[j] + triangleNumbers[k];
//                    if (sum <= 1000) isEurekaNumber[sum] = true;
//                }
//            }
//        }


        for (int i = 1; i <= 1000; i++) {
            if (!isSumOfTriangle[i]) continue;
            for (int j = 0; j < triangleNumberCount; j++) {
                int eurekaNumber = i + triangleNumbers[j];
                if (eurekaNumber > 1000) break;
                isEurekaNumber[eurekaNumber] = true;
            }
        }

    }

    public static void main(String[] args) {
        preprocess();
        //3에서 1000까지
        //iseurekaNumber[] 로 계산해두고ㅍ

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int k = sc.nextInt();
            System.out.println(isEurekaNumber[k] ? "1" : "0");
        }
    }


//    private static int getTriangleNumbers(int[] triangleNumbers, int k) {
//    }
}
