package Programmers.Algorithm.Level1;

public class KimFind {
    public String solution(String[] seoul) {
        int keep = 0;
        for (int i = 0; i < seoul.length; ++i) {
            if (seoul[i].equals("Kim")) {
                keep = i;
                break;
            }
        }

        return "김서방은 " + keep + "에 있다";

    }
}
