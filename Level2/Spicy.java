package Programmers.Level2;

import java.util.PriorityQueue;

public class Spicy {
    public static int solution(int[] scoville, int K) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; ++i) {
            pq.offer(scoville[i]);
        }

        int a = 0, b = 0, c =0;
        while (pq.peek() < K) {
            if (pq.size() == 1) {
                return -1;
            }
            a = pq.poll();
            b = pq.poll();
            c = a + b * 2;
            pq.offer(c);
            count++;
        }

        if (pq.peek() >= K) {
            return count;
        }

         return -1;

    }

    public static void main(String[] args) {
        int[] s = {1,2,3,9,10,12};
        System.out.println(solution(s, 7));
    }
}
