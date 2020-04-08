package Programmers.Algorithm.KAKAO_BLIND_RECUITMENT_2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    int x;
    double y;

    public Solution(int x, double y) {
        this.x = x;
        this.y = y;
    }

    public Solution() {

    }

    public static int[] solution(int N, int[] stages) {
        List<Solution> list = new ArrayList<>();
        int[] answer = new int[N];
        int len = stages.length;
        for (int i = 1; i <= N; ++i) {
            int count = 0;
            for (int j = 0; j < stages.length; ++j) {
                if (stages[j] <= i) {
                    count++;
                    stages[j] = 505;
                }
            }
            double value = (double)count / (double)len;
            len = len - count;
            Solution fa = new Solution(i, value);
            list.add(fa);
        }

        Collections.sort(list, new Comparator<Solution>() {
            @Override
            public int compare(Solution fa1, Solution fa2) {
                if (fa1.y > fa2.y) {
                    return -1;
                }
                else if (fa1.y < fa2.y) {
                    return 1;
                }

                return 0;
            }
        });

        for (int i = 0; i < answer.length; ++i) {
            answer[i] = list.get(i).x;
        }

        return answer;
    }

    public static void main(String[] args) {
        //int [] list = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] list = {4,4,4,4,4};
        int[] answer = solution(4, list);

        for (int a : answer) {
            System.out.println(a);
        }
    }
}