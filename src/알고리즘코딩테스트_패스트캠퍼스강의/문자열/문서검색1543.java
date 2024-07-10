package 알고리즘코딩테스트_패스트캠퍼스강의.문자열;

import java.util.Scanner;

public class 문서검색1543 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String doc = scanner.next();
        String word = scanner.next();

        //방법1
//        int count = 0;
//        //문서검색하고 있는거 찾기
//        for (int i = 0; i < doc.length(); i++) {
//            boolean isMatch = true;
//            for (int j = 0; j < word.length(); j++) {
//                if (i + j >= doc.length() || doc.charAt(i + j) != word.charAt(j)) {
//                    isMatch = false;
//                    break;
//                }
//            }
//            if (isMatch) {
//                count++;
//                i += doc.length() - 1;
//
//            }
//        }
//        System.out.println(count);

        //방법2 인덱스 사용
//        int startIndex = 0;
//        int count = 0;
//        while (true) {
//            int findIndex = doc.indexOf(word, startIndex);
//            if (findIndex < 0) {
//                break;
//            }
//            startIndex = findIndex + word.length();
//            count++;
//        }


        //방법3 있는 단어 제거
        String replaced = doc.replace(word, "");
        System.out.println("replaced = " + replaced);
        int length = doc.length() - replaced.length();
        int count = length / word.length();
        System.out.println(count);

    }
}
