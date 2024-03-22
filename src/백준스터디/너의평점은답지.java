package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 너의평점은답지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        //이수한 과목의 총 학점
        int n = 0;
        //전공평점의 합
        double sum = 0.0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());//학점
            String grade = st.nextToken();//등급
            if (!grade.equals("P")) {
                n += credit;
                switch (grade) {
                    case "A+":
                        sum += 4.5 * credit;
                        break;
                    case "A0":
                        sum += 4.0 * credit;
                        break;
                    case "B+":
                        sum += 3.5 * credit;
                        break;
                    case "B0":
                        sum += 3.0 * credit;
                        break;
                    case "C+":
                        sum += 2.5 * credit;
                        break;
                    case "C0":
                        sum += 2.0 * credit;
                        break;
                    case "D+":
                        sum += 1.5 * credit;
                        break;
                    case "D0":
                        sum += credit;
                        break;
                    case "F":
                        sum += 0.0;
                        break;
                }
            }

        }
        System.out.println("sum = " + sum);
        System.out.println("n = " + n);
        

        double average = sum / n;
        System.out.println("average = " + average);

    }
}
