package Programmers.Algorithm.Level2;

import java.util.ArrayList;
import java.util.List;

public class Develop_2 {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];                  // 배포 일 수 저장하기

        for (int i = 0; i < progresses.length; ++i) {
            int a = (100 - progresses[i]) % speeds[i];
            if (a == 0) {
                answer[i] = (100 - progresses[i]) / speeds[i];
            }
            else {
                answer[i] = ((100 - progresses[i]) / speeds[i]) + 1;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < answer.length; ++i) {
            int count = 1;
            for (int j = i; j < answer.length; ++j) {
                if (i == j) continue;
                if (answer[i] >= answer[j]) {
                    count++;
                }
                else {
                    break;
                }
            }
            i = i + count - 1;
            list.add(count);
        }

        int[] last = new int[list.size()];

        for (int i = 0; i < list.size(); ++i) {
            last[i] = list.get(i);
        }

        return last;
    }

    public static void main(String[] args) {
        int[] p = {93, 30, 55};
        int[] s = {1, 30, 5};
        int[] answer = solution(p, s);

        for (int a : answer) {
            System.out.print(a + " ");
        }
    }
}
