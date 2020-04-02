package Programmers.Algorithm.카카오개발자겨울인턴십;

import java.util.*;

public class Tuple {
    public static int[] solution(String s) {
        StringTokenizer st = new StringTokenizer(s, "{}");
        List<String> list = new LinkedList<>();
        List<Integer> li = new LinkedList<>();
        while (st.hasMoreTokens()) {
            String l = st.nextToken();
            if (l.equals(",")) {
                continue;
            }
            list.add(l);
        }


        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                }
                return 1;
            }
        });

        li.add(Integer.parseInt(list.get(0)));

        for (int i = 1; i < list.size(); ++i) {
            String[] k = list.get(i).split(",");

            for (int j = 0; j < k.length; ++j) {
                if (!li.contains(Integer.parseInt(k[j]))) {
                    li.add(Integer.parseInt(k[j]));
                }
            }
        }

        int[] answer = new int[li.size()];

        for (int i = 0; i < answer.length; ++i) {
            answer[i] = li.get(i);
        }

        return answer;


    }

    public static void main(String[] args) {
        //int[] answer = solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
        //int[] answer = solution("{{20,111},{111}}");
        int[] answer = solution("{{4,2,3},{3},{2,3,4,1},{2,3}}");
        //int[] answer = solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
        //int[] answer = solution("{{123}}");

        for (int k : answer) {
            System.out.print(k + ", ");
        }
    }
}
