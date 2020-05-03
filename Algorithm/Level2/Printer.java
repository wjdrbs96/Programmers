package Programmers.Algorithm.Level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int p : priorities) {
            pq.offer(p);
        }

        while (!pq.isEmpty()) {

            for (int i = 0; i < priorities.length; ++i) {
                if (pq.peek() == priorities[i]) {
                    pq.poll();
                    answer++;
                    if (location == i) {
                        pq.clear();
                        break;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] list = {2, 1, 3, 2};
        System.out.println((solution(list, 2)));
    }
}
