package 코딩테스트합격자되기_자바편.코딩테스트필수문법;

import java.util.Arrays;
import java.util.Comparator;

class Node {
    //멤버 변수
    int cost;

    public Node(int cost) {
//        this.dest = dest;
        this.cost = cost;
    }

//    @Override
//    public String toString() {
//        return "dest:" + dest + " cost:" + cost;
//    }

    public static void main(String[] args) {
//        Node[] nodes = new Node[5];
//        nodes[0] = new Node(10);
//        nodes[1] = new Node(20);
//        nodes[2] = new Node(15);
//        nodes[3] = new Node(5);
//        nodes[4] = new Node(25);
        Integer[] nodes = {1, 4, 10, 11, 23, 100};
        //람다식! 코스트를 기준으로 비교
        Arrays.sort(nodes, (Integer o1, Integer o2) -> Integer.compare(o1, o2));

        Arrays.sort(nodes, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });


        System.out.println(Arrays.toString(nodes));


    }

}