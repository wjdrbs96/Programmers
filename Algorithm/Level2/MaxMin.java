package Programmers.Algorithm.Level2;

import java.util.Arrays;

public class MaxMin {
    public static String solution(String s) {
        String[] list = s.split(" ");
        int[] save = new int[list.length];

        for (int i = 0; i < list.length; ++i) {
            save[i] = Integer.parseInt(list[i]);
        }

        Arrays.sort(save);

        String k = save[0] + " " + save[save.length - 1];

        return k;
    }

    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
    }
}
