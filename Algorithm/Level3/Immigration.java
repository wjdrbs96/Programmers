package Programmers.Algorithm.Level3;

import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;

        Arrays.sort(times);
        long start, mid, end;
        start = 0;
        end = Long.MAX_VALUE;
        long sum;

        while (start <= end){

            mid = (start + end) / 2;
            sum = 0;

            // times = [7, 10], n = 6    최대걸리는 시간 60
            // 모든 입국 심사관들이 총 받을 수 있는 사람 수
            for (int i = 0; i < times.length; i++) {
                sum += mid / times[i];   // 30 / 7 => 4명
                // n => 인원 수
                if (sum >= n) {
                    break;
                }
            }

            // 중간 시간 모든 인원을 심사 못했을 때
            if (n > sum) {
                start = mid + 1;
            }

            // 중간 시간 모든 인원을 심사 했을 때
            else {
                end = mid - 1;
                answer = mid;
            }
        }

        return answer;
    }
}
