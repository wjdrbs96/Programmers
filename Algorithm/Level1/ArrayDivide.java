package Programmers.Algorithm.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDivide {
    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.size() == 0) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); ++i) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;

    }
}
