package Programmers.Algorithm.월간코드챌린지시즌1;

public class ThreeBub {
    public static int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        while (n >= 3) {
            sb.append(n % 3);
            n = n / 3;
        }
        sb.append(n);
        sb.reverse();

        for (int i = 0; i < sb.length(); ++i) {
            char c = sb.charAt(i);
            answer += (Integer.parseInt(String.valueOf(c)) * Math.pow(3, i));
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(125));
    }
}
