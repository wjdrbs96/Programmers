package Programmers.Algorithm.KAKAO_BLIND_RECRUITMENT_2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenChat {
    public static String[] solution(String[] record) {
        List<String> list = new ArrayList<>();
        Map<String, String> hm = new HashMap<>();

        for(int i = 0 ; i < record.length ; i++) {
            String[] s = record[i].split(" ");
            if(!s[0].equals("Leave"))
                hm.put(s[1], s[2]);
        }

        for (int i = 0; i < record.length; ++i) {
            String[] s = record[i].split(" ");
            if (s[0].equals("Enter")) {
                list.add(hm.get(s[1]) + "님이 들어왔습니다");
            }
            else if (s[0].equals("Leave")) {
                list.add(hm.get(s[1]) + "님이 나갔습니다");
            }
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; ++i) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] s = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        solution(s);


    }
}
