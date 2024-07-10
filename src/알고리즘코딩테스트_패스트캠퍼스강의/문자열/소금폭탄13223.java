package 알고리즘코딩테스트_패스트캠퍼스강의.문자열;

import java.util.Scanner;

public class 소금폭탄13223 {

    //해설답지 |
    //TODO: 답안다시 확인

//        Scanner scanner = new Scanner(System.in);
//        String currentTime = scanner.nextLine();
//        String nextTime = scanner.nextLine();
//
//        String[] currentTimeUnit = currentTime.split(":");
//        int currentHour = Integer.parseInt(currentTimeUnit[0]);
//        int currentMinute = Integer.parseInt(currentTimeUnit[1]);
//        int currentSecond = Integer.parseInt(currentTimeUnit[2]);
//        int currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;
//
//        String[] dropUnit = currentTime.split(":");
//        int dropHour = Integer.parseInt(dropUnit[0]);
//        int dropMinute = Integer.parseInt(dropUnit[1]);
//        int dropSecond = Integer.parseInt(dropUnit[2]);
//        int dropSecondAmount = dropHour * 3600 + dropMinute * 60 + dropSecond;
//
//        int needSecondAmount = dropSecondAmount - currentSecondAmount;
//        if (needSecondAmount <= 0) {
//            needSecondAmount += 24 * 3600;
//        }
//


//00:00:00 말고 24:00:00로 출력되어야한다는 조건하나를 놓쳤었구나 : 해결함

    public static void main(String[] args) {
        //출력할 때
        //초 60이상이면 초에서 60초를 빼서 나머지를 갖고 분++
        //분 60이상이면 60빼서 나머지 갖고 시++
        //시가 24면 00으로 표기


        //출력값은 소금투하시간 - 현재시간
        //시: 분 : 초 를 뺄때
        //23까지 59까지 59까지 나타낸다
        //24 는 00
        //60 이면 00

        Scanner scanner = new Scanner(System.in);
        String currentTime = scanner.nextLine();
        String nextTime = scanner.nextLine();

        int[] currentTimeArray = new int[3];
        int[] nextTimeArray = new int[3];

        int index = 0;

        for (int j = 0; j <= 6; j += 3) {

            currentTimeArray[index] = Integer.parseInt(currentTime.substring(j, j + 2));
            nextTimeArray[index] = Integer.parseInt(nextTime.substring(j, j + 2));
            index++;
            if (j + 2 >= 8) {
                break;
            }
        }

        int[] answerArray = new int[3];
        for (int i = 0; i < answerArray.length; i++) {
            int time = 24;
            if (i != 0) {

                time = 60;

            }

            if (currentTimeArray[i] < nextTimeArray[i]) {
                answerArray[i] = nextTimeArray[i] - currentTimeArray[i];
            } else {
                if (time == 60) {
                    answerArray[i - 1]--;
                }

                answerArray[i] = (nextTimeArray[i] + time) - currentTimeArray[i];

            }
        }


        for (int i = answerArray.length - 1; i >= 0; i--) {
            if (answerArray[i] >= 60 && i != 0) {
                answerArray[i] = answerArray[i] - 60;
                answerArray[i - 1]++;
            } else if (answerArray[i] >= 24 && i == 0) {
                answerArray[i] = 0;

            }

        }


        boolean same = false;
        for (int i = 0; i < answerArray.length; i++) {
            if (answerArray[i] != 0) {
                same = false;
                break;

            }
            same = true;
        }

        //answerArray -> 답이 만약에 00:00:00이면 24:00:00로 출력하겠다.
        if (same) {
            System.out.println("24:00:00");

        } else {
            System.out.println(String.format("%02d:%02d:%02d", answerArray[0], answerArray[1], answerArray[2]));
        }


    }
}
