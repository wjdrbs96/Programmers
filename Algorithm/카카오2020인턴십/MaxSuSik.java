package Programmers.Algorithm.카카오2020인턴십;

import java.util.ArrayList;
import java.util.List;

/**
 * created by jg 2021/04/18
 */
public class MaxSuSik {
    public long solution(String expression) {
        long answer = 0;


        List<Integer> list = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        String[] split = expression.split("");
        for (int i = 0; i < split.length; ++i) {
            if (split[i].equals("+") || split[i].equals("-") || split[i].equals("*")) {
                strings.add(split[i]);
                list.add(Integer.parseInt(sb.toString()));
                sb.delete(0, sb.length());
            } else {
                sb.append(split[i]);
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        String s = "100-200*300-500+20";
    }
}
