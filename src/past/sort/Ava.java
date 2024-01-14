package past.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ava {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int sum = 0;
        int array[] =new int[5];
        for(int i=0; i<5; i++){
            int n = Integer.parseInt(reader.readLine());
            sum += n;
            array[i] = n;

        }
        System.out.println(sum/5);
        Arrays.sort(array);
        System.out.println(array[array.length/2]);


    }

}
