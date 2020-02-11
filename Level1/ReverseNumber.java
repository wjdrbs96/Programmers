package Programmers.Level1;

public class ReverseNumber {
    public static int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];

        int l = 0;
        while (n > 0) {
            answer[l++] = (int)(n % 10);
            n = n / 10;

        }

        return answer;
    }


}
