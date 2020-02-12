package Programmers.Level2;

public class NumberExpre {
    public static int solution(int n) {
        int answer = 0;
        int count = 0;

        for (int i = 1; i <= n; ++i) {
            for (int j = i; j <= n; ++j) {
                answer += j;
                if (answer > n) break;
                if (answer == n) count++;
            }
            answer = 0;
        }

        return count;
    }

}
