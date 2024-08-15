package 리트코드;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class BackLogPriorityQueue {

    //K번째 최소/최대 원소 찾기
    //문제 설명: 주어진 배열에서 K번째로 작은 원소 또는 K번째로 큰 원소를 찾아야 합니다
    static int k = 5;

    public int check() {
        int[] nums = {0, 5, 1000, 9, 1, 2, 8, 3, 77, 83, 111};
//        PriorityQueue<Integer> miniHeap = new PriorityQueue<>(); //가장 작은 것부터

        //높은 수가 우선순위가짐
        PriorityQueue<Integer> miniHeap = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> answer = new ArrayList<>();
        for (int num : nums) {
            System.out.println("offer전 miniHeap.size(); = " + miniHeap.size());
            miniHeap.offer(num); //하나씩 추가~~
            System.out.println("offer후 miniHeap.size(); = " + miniHeap.size());


        }

        System.out.println("miniHeap 포문밖 = " + miniHeap);

        while (!miniHeap.isEmpty()) {
            //담는 것을 하고 싶은데
            answer.add(miniHeap.poll());
            //peek()은 삭제하지 않고 상위 노드 값 가져오기
            //poll() 삭제하면서 상위 노드 값 가져오기

        }
        System.out.println("answer = " + answer);

        return answer.size(); //k번째로 큰 원소
    }

    public static void main(String[] args) {
        BackLogPriorityQueue pq = new BackLogPriorityQueue();
        int check = pq.check();
        System.out.println("check = " + check);


    }
}
