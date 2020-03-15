package Programmers.Algorithm.Level2;

import java.util.HashMap;
import java.util.Map;

public class WeJang {
    public int solution(String[][] clothes) {
        int count = 0;

        Map<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < clothes.length; ++i) {
            if (hm.containsKey(clothes[i][1])) {
                hm.replace(clothes[i][1], hm.get(clothes[i][1])+ 1);
            } else {
                hm.put(clothes[i][1], 1);
            }
        }

        int answer = 1;
        for (int value : hm.values()) {
            answer *= (value + 1);
        }

        answer -= 1;

        return answer;


    }
}
