package 백준스터디;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//queue사용
//큐에서 데이터를 삭제하는 방법
//queue.remove() 큐에서 첫번째 요소를 삭제하고 반환한다.만약에 큐가 비어있으면 예외 발생
//queue.poll() 큐에서 첫번째 요소를 삭제하고 반환.만약 큐가 비어있으면 null반환

public class 요세푸스문제1158번 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        //큐에 미리 저장
        Queue<Integer> queue = new LinkedList<>();

        //큐 공부
//        queue.add(1);
//        queue.add(2);
//        //remove해봄
//        System.out.println("1)" + queue.remove());
//        System.out.println("1)" + queue.poll());
////        System.out.println("2)" + queue.remove());  //값이 없으면 예외 발생
//        System.out.println("2)" + queue.poll()); //값이 없으면 null 발생
//        queue.add(3);
//        queue.add(4);
//        queue.clear();
//        System.out.println("clear:" + queue);

        //큐에 다 넣기
        for (int i = 1; i < N; i++) {
            queue.add(i);
        }

        //답으로 쓸 StringBuilder 객체 만들기
        StringBuilder sb = new StringBuilder();
        sb.append('<');

        //큐에서 값을 빼서 넣고 반복해서 없을 때지 순회
        while (queue.size() > 1) {
            System.out.println("while-queue" + queue);
            for (int i = 1; i < K; i++) { //K번째 값을 가져와야하기 때문에 for문 돈다
                queue.add(queue.remove());
            }
            //1,2, 다음에 추가
            sb.append(queue.remove()).append(", ");
        }

        sb.append(queue.poll()).append('>');
        System.out.println(sb);


    }
}
