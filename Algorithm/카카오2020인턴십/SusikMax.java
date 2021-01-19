package Programmers.Algorithm.카카오2020인턴십;

import java.util.HashMap;
import java.util.Map;

public class SusikMax {
    public long solution(String expression) {
        long answer = 0;
        Map<Integer, Susik> pr = new HashMap<>();

        pr.put(1, new Susik("+", "-", "*"));
        pr.put(2, new Susik("+", "*", "-"));
        pr.put(3, new Susik("-", "+", "*"));
        pr.put(4, new Susik("-", "*", "+"));
        pr.put(5, new Susik("*", "+", "-"));
        pr.put(6, new Susik("*", "-", "+"));

        for (int i = 1; i <= pr.size(); ++i) {
            Susik susik = pr.get(i);
            String pr1 = susik.ch1;
            String[] split = expression.split(pr1);
        }

        return answer;
    }
    public static void main(String[] args) {

    }
}

class Susik {
    String ch1;
    String ch2;
    String ch3;

    public Susik(String ch1, String ch2, String ch3) {
        this.ch1 = ch1;
        this.ch2 = ch2;
        this.ch3 = ch3;
    }
}