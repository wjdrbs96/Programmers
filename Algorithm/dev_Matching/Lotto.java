package Programmers.Algorithm.dev_Matching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * created by Gyunny 2021/08/23
 */
public class Lotto {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(6, 1);
        map.put(5, 2);
        map.put(4, 3);
        map.put(3, 4);
        map.put(2, 5);
        map.put(1, 6);
        map.put(0, 6);

        int count = 0;
        int zeroCount = 0;
        for (int i = 0; i < lottos.length; ++i) {
            for (int j = 0; j < win_nums.length; ++j) {
                if (lottos[i] == 0) {
                    zeroCount++;
                    break;
                }
                if (lottos[i] == win_nums[j]) {
                    count++;
                    break;
                }
            }
        }

        return new int[]{map.get(count + zeroCount), map.get(count)};
    }

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_numbers = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(solution(lottos, win_numbers)));
    }
}
