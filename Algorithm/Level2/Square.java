package Programmers.Algorithm.Level2;

public class Square {
    public static long solution(int w, int h) {
        long answer = 1;

        if (h == 1) return 0;

        if (w == h) {
            answer = w * h - w;
            return answer;
        }

        if (w < h) {

        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(8, 12));
    }
}
