package past.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 1427번
public class SortInsight {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read = reader.readLine();
        int numArray[] = new int[read.length()];

        for ( int i=0; i< read.length(); i++){
        // 문자열에서 i번째 문자 가져오기
            char c = read.charAt(i);
            //문자를 숫자로 변환
            int digit = Character.getNumericValue(c);
            //배열에 숫자 저장
            numArray[i] = digit;
        }

        Arrays.sort(numArray);


        int t =0;
        //거꾸로 만들어보자
        for (int i =0; i<numArray.length/2; i++ ){
            t= numArray[i];
            numArray[i] = numArray[numArray.length-i -1] ;
            numArray[numArray.length-i-1] = t;


        }

        //배열의 내용 출력
        for (int num: numArray){
            System.out.print(num);
        }


    }



}
