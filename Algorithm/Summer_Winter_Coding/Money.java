package Programmers.Algorithm.Summer_Winter_Coding;

import java.util.Arrays;

public class Money {

    public static int solution(int[] d, int budget) {
        int count = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; ++i) {
            if (budget - d[i] >= 0) {
                budget = budget - d[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int answer = solution(d, 9);
        System.out.println(answer);
    }
}
