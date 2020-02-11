package Programmers.Level1;

public class OddString {
    public String solution(String s) {
        String[] data = s.split("");
        String answer = "";
        int len = data.length;
        int cnt = 0;

        for (int i = 0; i < len; ++i) {
            if (data[i].equals(" ")) {
                cnt = 0;
            } else {
                if (cnt % 2 == 0) {
                    data[i] = data[i].toUpperCase();
                    cnt++;
                } else {
                    data[i] = data[i].toLowerCase();
                    cnt++;
                }
            }
            answer += data[i];
        }
        return answer;
    }
}
