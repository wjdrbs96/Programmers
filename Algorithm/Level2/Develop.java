package Programmers.Algorithm.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Develop {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];

        for (int i = 0; i < progresses.length; ++i) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                answer[i] = (100 - progresses[i]) / speeds[i];
            } else {
                answer[i] = (100 - progresses[i]) / speeds[i] + 1;
            }
        }


        int count = 1;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < answer.length; ++i) {
            for (int j = i + 1; j < answer.length; ++j) {
                if (answer[i] < answer[j]) {
                    break;
                }
                count++;
            }
            list.add(count);
            i = i + count - 1;
            count = 1;
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); ++i) {
            ans[i] = list.get(i);
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] pro = {93, 30, 55};
        int[] spe = {1, 30, 5};

        System.out.println(Arrays.toString(solution(pro, spe)));
    }
}
