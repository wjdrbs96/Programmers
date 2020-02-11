package Programmers.Level1;

import java.util.ArrayList;
import java.util.List;

public class NotSameNumber {
    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int PreN = 10;
        for (int num : arr) {
            if (PreN != num) {
                list.add(num);
            }
            PreN = num;
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; ++i) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
