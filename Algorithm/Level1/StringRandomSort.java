package Programmers.Algorithm.Level1;

import java.util.Arrays;
import java.util.Comparator;

public class StringRandomSort {

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                }

                return o1.charAt(n) - o2.charAt(n);
            }
        });
        return strings;
    }

}
