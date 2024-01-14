package past.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 25305번
public class CutLine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        // 두 번째 줄을 읽어서 배열로 저장합니다.
        st = new StringTokenizer(reader.readLine());
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(values);
        System.out.println(values[n-k]);

        // 출력
        System.out.println("n: " + n);
        System.out.println("k: " + k);
        System.out.print("Values: ");
        for (int i = 0; i < n; i++) {
            System.out.print(values[i] + " ");
        }


    }
}
