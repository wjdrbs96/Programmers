package Programmers.Algorithm.Level2;

import java.util.*;

public class MaxNumber {
    public String solution(int[] numbers) {
        String answer = "";
        String[] num = new String[numbers.length];

        for (int i = 0; i < num.length; ++i) {
            num[i] = String.valueOf(numbers[i]);
        }


        Arrays.sort(num, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        if (num[0].equals("0")) return "0";

        for (int i = 0; i < num.length; ++i) {
            answer += num[i];
        }

        return answer;
    }
}
