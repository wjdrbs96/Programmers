package Programmers.Algorithm.월간코드챌린지시즌1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TwoNumberSum {
    public static int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; ++i) {
            for (int j = i + 1; j < numbers.length; ++j) {
                if (i == j) continue;
                set.add(numbers[i] + numbers[j]);
            }
        }

        Iterator<Integer> iterator = set.iterator();

        int i = 0;
        int[] list = new int[set.size()];
        while (iterator.hasNext()) {
            list[i] = iterator.next();
            i++;
        }

        Arrays.sort(list);
        return list;
    }

    public static void main(String[] args) {
        //int[] l = {2, 1, 3, 4, 1};
        int[] l = {5, 0, 2, 7};
        int[] solution = solution(l);

        System.out.println(Arrays.toString(solution));
    }
}
