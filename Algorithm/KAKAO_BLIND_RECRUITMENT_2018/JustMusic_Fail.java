package Programmers.Algorithm.KAKAO_BLIND_RECRUITMENT_2018;

import java.util.*;

class Save {
    int time;
    String name;

    public Save(int time, String name) {
        this.time = time;
        this.name = name;
    }
}

public class JustMusic_Fail {
    public static String solution(String m, String[] musicinfos) {

        List<Save> list = new ArrayList<>();
        List<Save> l = new ArrayList<>();
        String[] s = {"C#", "D#", "F#", "G#", "A#"};
        String[] lower = {"c", "d,", "f", "g", "a"};

        for (int i = 0; i < musicinfos.length; ++i) {
            String[] sp = musicinfos[i].split(",");
            String[] startTime = sp[0].split(":");
            String[] endTime = sp[1].split(":");


            // #이 붙은 것들을 소문자 알파벳으로 교체
            for (int p = 0; p < s.length; ++p) {
                sp[3] = sp[3].replaceAll(s[p], lower[p]);
                m = m.replaceAll(s[p], lower[p]);
            }

            // 시간구하기
            int sumTime = (Integer.parseInt(endTime[0]) - Integer.parseInt(startTime[0])) * 60 + Integer.parseInt(endTime[1]) - Integer.parseInt(startTime[1]);

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < sumTime; ++j) {
                sb.append(sp[3].charAt(j % sp[3].length()));
            }

            for (int k = 0; k < sb.toString().length() - m.length() + 1; ++k) {
                if (m.equals(sb.toString().substring(k, k + m.length()))) {
                    list.add(new Save(sumTime, sp[2]));
                    l.add(new Save(sumTime, sp[2]));
                    System.out.println(sumTime + " " + sp[2]);
                }
            }

        }

        // 음악 리스트가 여러개 일 때
        if (list.size() > 1) {
            // 시간을 기준으로 정렬하기
            Collections.sort(list, new Comparator<Save>() {
                @Override
                public int compare(Save o1, Save o2) {
                    return o1.time - o2.time;
                }
            });

            // 여러개 중에서 재생시간이 같은 것이 한 개 이상 존재할 때
            if (list.get(list.size() - 1).time == list.get(list.size() - 2).time) {
                // 존재하면 처음부터 탐색해서 가장 먼저 나온 이름을 반환
                for (int i = 0; i < list.size(); ++i) {
                    if (list.get(i).time == list.get(list.size() - 1).time) {
                        return list.get(i).name;
                    }
                }
            }

            // 여러개 존재하지만, 재생시간이 같은 것이 존재하지 않을 때
            return list.get(list.size() - 1).name;
        }

        else if (list.size() == 1) {
            return list.get(0).name;
        }


        return "(None)";

    }

    public static void main(String[] args) {
        //String m = "ABCDEFG";
        //String[] music = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        String m = "ABC";
        String[] music = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        solution(m, music);
    }
}

