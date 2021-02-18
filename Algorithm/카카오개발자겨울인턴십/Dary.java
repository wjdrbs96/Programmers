package Programmers.Algorithm.카카오개발자겨울인턴십;

// 효율성에서 시간초과나는 코드 (정확성은 맞음) => 너무 쉬워서 띠용? 했으나 역시 효율성..
public class Dary {
    public int solution(int[] stones, int k) {
        int answer = 0;

        loop: while (true) {
            int count = 0;

            for (int i = 0; i < stones.length; ++i) {
                if (stones[i] > 0) {
                    stones[i] = stones[i] - 1;
                    count = 0;
                    continue;
                }
                else if (stones[i] == 0) {
                    count++;
                }
                if (count >= k) {
                    break loop;
                }
            }
            answer++;
        }

        return answer;
    }
}

/**
 * 성공 코드 (이진 탐색)
 */

class Solution {
    public int solution(int[] stones, int k) {
        int left = 1;
        int right = 200000000;
        int mid = 0;
        int answer = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            int count = 0;
            boolean isPossible = true;

            for (int i = 0; i < stones.length; ++i) {
                int now = stones[i];
                now -= mid;
                if (now >= 0) {
                    count = 0;
                }
                else if (now < 0) {
                    count++;
                }
                if (count >= k) {
                    isPossible = false;
                    break;
                }
            }
            if (!isPossible) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
                answer = answer > mid ? answer : mid;
            }
        }
        return answer;
    }
}
