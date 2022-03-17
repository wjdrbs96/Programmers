package Programmers.Algorithm.월간코드챌린지시즌1;

import java.util.Arrays;

/**
 * created by Gyunny 2022/01/11
 */
public class Tired {
    public static int solution(int k, int[][] dungeons) {
        int answer = 0;

        Arrays.sort(dungeons, (int[] o1, int[] o2) -> {
            if ((o1[0] - o1[1]) < (o2[0] - o2[1])) {
                return 1;
            }

            return -1;
        });

        for (int i = 0; i < dungeons.length; ++i) {
            if (dungeons[i][0] <= k) { // 던전 참여 가능
                k -= dungeons[i][1];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] list = {{80,20},{50,40},{30,10}};

        System.out.println(solution(80, list));
    }
}
