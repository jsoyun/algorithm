package 백준스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 너의평점은25206번 {
    public static void main(String[] args) throws IOException {
        // A+ A0 B+ B0 C+ C0 D+ D0 F P //키값으로 저장


        //기준 띄어쓰기
        Map<String, Double> scoreMap = new HashMap<>();
        scoreMap.put("A+", 4.5);
        scoreMap.put("A0", 4.0);
        scoreMap.put("B+", 3.5);
        scoreMap.put("B0", 3.0);
        scoreMap.put("C+", 2.5);
        scoreMap.put("C0", 2.0);
        scoreMap.put("D+", 1.5);
        scoreMap.put("D0", 1.0);
        scoreMap.put("F", 0.0);
        scoreMap.put("P", 1.0);


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double totalScore = 0.0;
        int classNum = 0;


        for (int i = 0; i < 20; i++) {
            String[] token = bufferedReader.readLine().split(" ");
            String credit = token[1]; //학점
            String grade = token[2]; //등급
            Double score = scoreMap.get(grade);


            if (grade != "P") {
                classNum += Double.parseDouble(credit);

                totalScore += Double.parseDouble(credit) * score;


            }


        }
        System.out.println("totalScore = " + totalScore);
        System.out.println("classNum = " + classNum);


        double answer = totalScore / classNum;
        System.out.printf("%.6f", answer);

        bufferedReader.close();


    }
}
