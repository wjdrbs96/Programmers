package Programmers.Algorithm.Level1;

public class Tile {
    public static long solution(int N) {
        long[] list = new long[N];
        list[0] = 1;
        list[1] = 1;

        for (int i = 2; i < N; ++i) {
            list[i] = list[i - 1] + list[i - 2];
        }

        return 4 * list[N - 1] + 2 * list[N - 2];
    }

    public static void main(String[] args) {
        System.out.println(solution(7));
    }
}
