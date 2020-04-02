package Programmers.Algorithm.KAKAO_BLIND_RECRUITMENT_2018;

import java.util.*;

public class Fail {
    int x;
    int y;

    public Fail(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void solution(int N, int[] stages) {
        Arrays.sort(stages);
        int count1 = 0;
        int count2 = 0;
        List<Fail> list = new ArrayList<>();
        int[] answer = new int[N];

        for (int i = 1; i <= N; ++i) {
            count1 = 0;
            count2 = 0;
            for (int j = 0; j < stages.length; ++j) {
                if (i <= stages[j]) {
                    count1++;
                }
                if (i == stages[j]) {
                    count2++;
                }
            }
            Fail fail = new Fail(count1, count2);
            list.add(fail);
        }

        Map<Integer, Fail> hm = new HashMap<>();

        for (int i = 0; i < list.size(); ++i) {
            hm.put(i + 1, list.get(i));
        }

        for (Fail fail : list) {
            System.out.println(fail.x);
            System.out.println(fail.y);
        }
        System.out.println();

        Collections.sort(list, new Comparator<Fail>() {
            @Override
            public int compare(Fail o1, Fail o2) {

                if (o1.x * o2.y < o2.y * o2.x) {
                    if (o1.x * o2.y == 0) {
                        return -1;
                    }
                    else if (o1.y * o2.x == 0) {
                        return 1;
                    }
                    return -1;
                }
                else if (o1.x * o2.y > o2.y * o2.x) {
                    return 1;
                }

                return 0;
            }
        });


        for (Fail fail : list) {
            System.out.println(fail.x);
            System.out.println(fail.y);
        }
        System.out.println();

        for (int i = 0; i < list.size(); ++i) {
            for (int k : hm.keySet()) {
                if (list.get(i).x == hm.get(k).x && list.get(i).y == hm.get(k).y) {
                    answer[i] = k;
                }
            }
        }

        for (int L : answer) {
            System.out.println(L);
        }


    }

    public static void main(String[] args) {
        //int[] s = {2,1,2,6,2,4,3,3};
        int[] s = {4,4,4,4,4};
        solution(4, s);
    }
}
