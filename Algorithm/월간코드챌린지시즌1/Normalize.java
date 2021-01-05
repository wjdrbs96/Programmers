package Programmers.Algorithm.월간코드챌린지시즌1;

public class Normalize {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; ++i) {
            answer += (a[i] * b[i]);
        }

        return answer;
    }
}
