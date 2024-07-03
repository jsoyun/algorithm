package 프로그래머스.해시;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class 신고결과받기 {
//    각 유저는 한 번에 한 명의 유저 신고가능
//    신고횟수에 제한없음, 서로 다른 유저를 계속 신고 가능
//    한유저를 여러번 신고할 수 있으나 동일한 유저에 대한 신고횟수는 1회로 처리됨\

//    k번 이상 신고된 유저는 게시판 이용이 정지됨, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송한다
//    유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용정지 시키면서 정지메일 발송

//각 유저별로 처리 결과 메일을 받은 횟수를 배열에 담아 return

    public static void main(String[] args) {
//        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};

        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 2;

        신고결과받기 신고결과받기 = new 신고결과받기();
        int[] solution = 신고결과받기.solution(id_list, report, k);
        System.out.println(solution);

    }

    public int[] solution(String[] id_list, String[] report, int k) {


        //중복 제거
        Set<String> uniqueNamesSet = new HashSet<>(Arrays.asList(report));

        // 중복이 제거된 결과를 배열로 변환
        String[] uniqueNames = uniqueNamesSet.toArray(new String[0]);

        //신고당한_내역
        HashMap<String, Integer> 신고당한_내역 = new HashMap<>();
        for (String name : id_list) {
            신고당한_내역.put(name, 0);
        }
        //신고자 key 신고당한사람 값
        HashMap<String, String> report_map_신고한내용 = new HashMap<>();
        HashMap<String, Integer> result_check = new HashMap<>();
        for (String name : id_list) {
            result_check.put(name, 0);
        }


        for (String content : uniqueNames) {
            String[] strings = content.split(" ");
            String 신고자 = strings[0];
            String 신고당한사람 = strings[1];
            report_map_신고한내용.put(신고자, 신고당한사람);
            if (신고당한_내역.containsKey(report_map_신고한내용.get(strings[0]))) {
                System.out.println("id_list_map.get(신고당한사람) = " + 신고당한_내역.get(report_map_신고한내용.get(strings[0])));
                신고당한_내역.put(신고당한사람, 신고당한_내역.get(신고당한사람) + 1);
            }


        }


        int[] result = new int[id_list.length];
        for (String content : uniqueNames) {
            String[] strings = content.split(" ");
            String 신고자 = strings[0];
            String 신고당한사람 = strings[1];
            if (신고당한_내역.get(신고당한사람) >= k) {
                result_check.put(신고자, result_check.get(신고자) + 1);
            }

        }

        //result 내가 신고한 이용자 중 2건이상 신고접수된 고객을 출력한다
        System.out.println("result_check" + result_check);

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            result[i] = result_check.get(name);
        }

        return result;


    }
}

