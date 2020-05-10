package Programmers.Algorithm.KAKAO_BLIND_RECRUITMENT_2018;

public class JustMusic_Clear {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        int ansTime = 0;
        for(int i = 0; i < musicinfos.length; i++){
            String[] temp = musicinfos[i].split(",");
            String[] start = temp[0].split(":");
            String[] end = temp[1].split(":");

            temp[3] = replaceSharp(temp[3]);
            m = replaceSharp(m);
            int time = (Integer.parseInt(end[0]) - Integer.parseInt(start[0])) * 60 + Integer.parseInt(end[1]) - Integer.parseInt(start[1]);
            String playRecord = "";
            for(int j = 0; j < time; j++) {
                playRecord += temp[3].charAt(j % temp[3].length());
            }
            if(playRecord.contains(m)) {
                if(ansTime < time) {
                    answer = temp[2];
                    ansTime = time;
                }
            }
        }
        if(ansTime == 0) {
            answer = "(None)";
        }

        return answer;
    }

    private String replaceSharp(String input) {
        input = input.replace("C#","H");
        input = input.replace("D#","I");
        input = input.replace("F#","J");
        input = input.replace("G#","K");
        input = input.replace("A#","L");
        return input;
    }
}
