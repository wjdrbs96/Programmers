package Programmers.Algorithm.Level2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Travel {
    public static String[] solution(String[][] tickets) {
        List<String> list = new LinkedList<>();
        Map<String, String> hm = new HashMap<>();

        for (int i = 0; i < tickets.length; ++i) {
            hm.put(tickets[i][0], tickets[i][1]);
        }

        for (int i = 0; i < hm.size(); ++i) {
            dfs(tickets[i][0], hm, tickets);
        }
        String[] answer = new String[list.size()];

        return answer;
    }

    public static void dfs(String start, Map<String, String> map, String[][] tickets) {
        
    }

    public static void main(String[] args) {
        String[][] ticket = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String[] answer = solution(ticket);

        for (String s : answer) {
            System.out.println(s);
        }

    }
}
