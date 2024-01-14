package past.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int array[] = new int[n];
        for (int i =0; i< array.length; i++){

            int k = scan.nextInt();

            array[i] = k;

        }
        Arrays.sort(array);

//        String arrayAsString = Arrays.toString(array);
//        System.out.println(arrayAsString +"");
        for (int i =0; i< array.length; i++){
          System.out.println(array[i]);

        }
        scan.close();


    }
}
