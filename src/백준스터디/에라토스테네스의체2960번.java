package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 에라토스테네스의체2960번 {
    //234567 N=7 //아직 지우지 않은 수중 가장 작은수P- 소수-> 첫번째P는 무조건 2
    // 3 5 7 //P =3  또 지우기 반복
    //K번째 지우는 수 구하기 -> 지울때마다 몇번째인지 확인필요

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //2부터 7까지의 배열?
        //String으로 -> 큐로??
//        StringBuilder stringBuilder = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        //처음은 2부터 7까지 만들어놓기 2부터 3까지면 ,
        for (int i = 2; i < N + 1; i++) {
            queue.add(i);
        }
        System.out.println("queue = " + queue);


//        Integer P = queue.poll(); //삭제하면서 하나 꺼냄 맨처음 2
        int k = 1;
        //P는 맨처음에는 2임.
        while (!queue.isEmpty()) {
            System.out.println("queue.peek() = " + queue.peek());
            //아니면 새로운 배열에 담아야하나?
            Integer peek = queue.peek();

            if (peek % 2 == 0) {
                queue.poll();
                k++; //번째 지워진 값을 알아야하네

            } else {
//                queue.add(peek);
                break;
            }
            System.out.println("queue = " + queue);
            

        }

//        for (int i = 0; i < queue.size(); i++) {
//            Integer peek = queue.peek();
//            if (peek % 2 == 0) {
//                queue.poll();
//            }
//        }
//        System.out.println("queue = " + queue);


    }

}
