package Programmers.Algorithm.Level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Travel {
    static List<String> list = new ArrayList<>();
    static boolean[] visit;
    static String route = "";

    public static String[] solution(String[][] tickets) {

        for (int i = 0; i < tickets.length; ++i) {
            visit = new boolean[tickets.length];
            String start = tickets[i][0];
            String end = tickets[i][1];

            if (start.equals("ICN")) {
                route = start + ",";
                visit[i] = true;
                dfs(tickets, end, 1);
            }
        }

        Collections.sort(list);
        String[] answer = list.get(0).split(",");

        return answer;
    }

    static void dfs(String[][] tickets, String end, int count) {
        route += end + ",";

        if (count == tickets.length) {
            list.add(route);
            return;
        }

        for (int i = 0; i < tickets.length; ++i) {
            String s = tickets[i][0];
            String e = tickets[i][1];

            if (s.equals(end) && !visit[i]) {
                visit[i] = true;
                dfs(tickets, e, count + 1);
                visit[i] = false;
                route = route.substring(0, route.length() - 4);
            }
        }
    }

    public static void main(String[] args) {
        String[][] list = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String[] answer = solution(list);

        for (String s : answer) {
            System.out.println(s);
        }
    }
}
