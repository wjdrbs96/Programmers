package Programmers.Algorithm.Level1;

import java.util.*;

public class Exam {
    public static int[] solution(int[] answers) {
        int[] m1 = {1, 2, 3, 4, 5};
        int[] m2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] m3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];

        for (int i = 0; i < answers.length; ++i) {
            if (answers[i] == m1[i % 5]) {
                cnt[0]++;
            }

            if (answers[i] == m2[i % 8]) {
                cnt[1]++;
            }

            if (answers[i] == m3[i % 10]) {
                cnt[2]++;
            }
        }

        // 제일 많이 맞힌 사람 구하기
        int max = cnt[0];
        for (int i = 0; i < cnt.length; ++i) {
            if (max < cnt[i]) {
                max = cnt[i];
            }
        }

        List<Integer> list = new ArrayList<>();

        // 많이 맞힌 사람이 여러명일 경우
        for (int i = 0; i < cnt.length; ++i) {
            if (max == cnt[i]) {
                // 해당 인덱스를 저장
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); ++i) {
            // 인덱스를 저장해서 0번 인덱스는 1번 이기 때문에 + 1
            answer[i] = list.get(i) + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = {1, 2, 3, 4, 5};
        int[] ans = {1, 3, 2, 4, 2};
        int[] a = solution(answer);
        //int[] a = solution(ans);

        for (int k : a) {
            System.out.println(k);
        }
    }
}
