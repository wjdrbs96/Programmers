package Programmers.Algorithm.월간코드챌린지시즌3;

import java.util.*;

/**
 * created by Gyunny 2022/03/17
 */
public class NotNumberAdd {
    public int solution(int[] numbers) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; ++i) {
            list.add(numbers[i]);
        }

        for (int i = 1; i <= 9; ++i) {
            if (!list.contains(i)) {
                answer += i;
            }
        }

        return answer;
    }
}
