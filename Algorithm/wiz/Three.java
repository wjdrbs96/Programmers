package Programmers.Algorithm.wiz;

import java.util.Arrays;
import java.util.Comparator;

/**
 * created by Gyunny 2021/08/29
 */
public class Three {
    public static int solution(int[][] envelopes) {
        int answer = 0;

        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        int[] tmp;
        for (int i = 0; i < envelopes.length; ++i) {
            for (int j = i + 1; j < envelopes.length; ++j) {
                if ((envelopes[i][0] < envelopes[j][0]) && envelopes[i][1] < envelopes[j][1]) {
                    i++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] em = {{3, 5}, {7, 5}, {3, 3}, {2, 1}};
        int[][] et = {{3, 4}, {1, 3}, {2, 5}, {1, 2}, {3, 5}, {2, 3}};
        System.out.println(solution(et));
    }
}
