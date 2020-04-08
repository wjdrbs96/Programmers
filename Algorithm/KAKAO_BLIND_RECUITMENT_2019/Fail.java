package Programmers.Algorithm.KAKAO_BLIND_RECUITMENT_2019;

import java.util.*;

public class Fail {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> hm = new TreeMap<>();
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
            hm.put(i, value);
        }

        List<Map.Entry<Integer, Double>> list = new LinkedList<>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                if (o1.getValue() > o2.getValue()) {
                    return -1;
                }
                else if (o1.getValue() < o2.getValue()) {
                    return 1;
                }

                return 0;
            }
        });

        for (int i = 0; i < list.size(); ++i) {
            answer[i] = list.get(i).getKey();
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
