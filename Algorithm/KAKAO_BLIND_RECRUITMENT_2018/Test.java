package Programmers.Algorithm.KAKAO_BLIND_RECRUITMENT_2018;

import java.util.*;

public class Test {
    public static String solution(String m, String[] musicinfos) {

        List<Save1> list = new ArrayList<>();

        for (int i = 0; i < musicinfos.length; ++i) {
            String[] sp = musicinfos[i].split(",");
            String[] startTime = sp[0].split(":");
            String[] endTime = sp[1].split(":");

            // 시간구하기
            int sumTime = (Integer.parseInt(endTime[0]) - Integer.parseInt(startTime[0])) * 60 + Integer.parseInt(endTime[1]) - Integer.parseInt(startTime[1]);

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < sumTime; ++j) {
                sb.append(sp[3].charAt(j % sp[3].length()));
            }

            for (int k = 0; k < sb.toString().length() - m.length() + 1; ++k) {
                if (m.equals(sb.toString().substring(k, k + m.length()))) {
                    if (sb.toString().charAt(k + m.length()) == '#' && k + m.length() < sb.toString().length()) {
                        continue;
                    }
                    list.add(new Save1(sumTime, sp[2]));
                    System.out.println(sumTime + " " + sp[2]);
                }
            }

        }

        if (list.size() > 1) {
            Collections.sort(list, new Comparator<Save1>() {
                @Override
                public int compare(Save1 o1, Save1 o2) {
                    return o1.time - o2.time;
                }
            });

            if (list.get(list.size() - 1).time == list.get(list.size() - 2).time) {
                for (int i = 0; i < list.size(); ++i) {
                    if (list.get(i).time == list.get(list.size() - 1).time) {
                        return list.get(i).name;
                    }
                }
            }

        }

        else if (list.size() == 1) {
            return list.get(0).name;
        }


        return "(None)";

    }

}

class Save1 {
    int time;
    String name;

    public Save1(int time, String name) {
        this.time = time;
        this.name = name;
    }

}
