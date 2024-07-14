package 알고리즘코딩테스트_패스트캠퍼스강의.배열;

import java.util.Scanner;

public class 줄세우기10431 {
    public static void main(String[] args) {

        //방법1
//        //뒤로 물러나야 하는 수는 자기보다 크면서 앞에 있는 수
//        //문제가 시키는대로 다 구현하지 않아도 답은 구할 수 있다
//        int[] h = new int[20];
//        for (int i = 0; i < 20; i++) {
//            h[i] = scanner.nextInt(); // 20개의 수를 삽입
//        }
//        int ans = 0; //시간복잡도 O(N^2)
//        for (int i = 0; i < 20; i++) {
//            for (int j = 0; j < i; j++) {
//                if (h[j] > h[i]) ans++; // 앞에 값이 더 크면 ++
//            }
//        }
//        // 지금은 전체가 20으로 고정되어 있지만
//        //고정되지 않은 N일 경우, 역순으로 4321-> 1234로 바꾸기 위해서는
//        // N*(N-1) /2 만큼걸린다


        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt(); // 띄어쓰기 기준 글자 하나만 가져오는구나
        //O(P) * O(N^2)
//        int count = 0;
        while (P-- > 0) {

            int T = scanner.nextInt();
            int[] h = new int[20];
            for (int i = 0; i < 20; i++) {
                //주어진 배열
                h[i] = scanner.nextInt();
            }
            int cnt = 0;
            //내가 다시 정렬하는 배열
            //앞에 있는 학생부터 줄 세울거임
            for (int i = 0; i < 20; i++) {
                //1. 줄 서 있는 학생 중에 자신보다 큰 학생 찾는다 -> 앞에서부터 순회
                //1-1. 찾지 못했다면 , 줄의 가장 뒤에 선다.
                for (int j = 0; j < i; j++) { //자기보다 앞이니까 i까지 순회한다
                    if (h[j] > h[i]) { //내가 앞보다 크면!
                        int temp = h[i];
                        //2. 찾았다면, 그 학생의 앞에 선다.
                        //3. 그 학생과 그 뒤의 학생이 모두 한칸씩 물러난다.
                        for (int k = i; k > j; k--) {
                            h[k] = h[k - 1];
                            //뒤로 물러날때마다 추가
                            cnt++;
                        }
                        h[j] = temp;
                        break;
                    }
                }


            }
            System.out.println(T + " " + cnt);


        }

    }
}
