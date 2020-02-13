package Programmers.Level1;

public class NNumber {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        long a = x;
        for (int i = 0; i < n; ++i) {
            answer[i] = x;
            x += a;
        }

        return answer;
    }
}
