package Programmers.Level1;

import java.util.Arrays;
import java.util.Collections;

class StringSort {
    public String solution(String s) {
        String[] ary = s.split("");
        Arrays.sort(ary);
        Collections.reverse(Arrays.asList(ary));

        return String.join("", ary);
    }
}