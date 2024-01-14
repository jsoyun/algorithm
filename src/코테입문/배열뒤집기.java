package 코테입문;

import java.util.List;

public class 배열뒤집기 {

    public static void main(String[] args) {
        int[] num_list = new int[]{1, 2, 3, 4, 5};
        int length = num_list.length;

        int[] new_array = new int[length]; //길이가 정해져있는데
        //리스트와 배열의 차이가 뭐지?
//        List array = new List<>();

        int i = 0;
        for (int value : num_list) {
            new_array[length - 1 - i] = value;
            i++;

        }

//        return new_array;

        System.out.println("new_array = " + new_array);
    }
}
