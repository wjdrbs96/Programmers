package Programmers.Algorithm.Level1;

import java.util.HashMap;
import java.util.Map;

public class Player {
    public static String solution(String[] participant, String[] competition) {
        String answer = "";

        Map<String, Integer> hm = new HashMap<>();

        for (String part : participant) {
            if (hm.get(part) == null) {
                hm.put(part, 1);
            } else {
                hm.put(part, hm.get(part) + 1);
            }
        }

        for (String comp : competition) {
            hm.put(comp, hm.get(comp) - 1);
        }

        for (String key : hm.keySet()) {
            if (hm.get(key) == 1) {
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] p = {"mislav", "stanko", "mislav", "ana"};
        String[] c = {"stanko", "ana", "mislav"};
        System.out.println(solution(p,c));
    }
}
