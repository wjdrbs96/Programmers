package Programmers.Algorithm.KAKAO_2021_INTERN;

import java.util.Arrays;

/**
 * created by Gyunny 2021/08/23
 */
public class Two {
    public static int[] solution(String[][] places) {
        int[] answer = {};

        for (int i = 0; i < places.length; ++i) {
            for (int j = 0; j < places[i].length; ++j) {
                
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[][] places = {
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
        };
        System.out.println(Arrays.toString(solution(places)));
    }
}
