package Programmers.Algorithm.Level2;

import java.util.ArrayList;
import java.util.List;

public class BaseBall {
    public static int solution(int[][] baseball) {
        int answer = 0;
        List<Ball> list = new ArrayList<>();

        for (int i = 1; i < 10; ++i) {
            for (int j = 1; j < 10; ++j) {
                for (int k = 1; k < 10; ++k) {
                    if (i != j && i != k && j != k) {
                        list.add(new Ball(i, j, k));
                    }
                }
            }
        }

        for (int i = 0; i < list.size(); ++i) {
            int count = 0;
            String a = makeString(list.get(i));
            for (int j = 0; j < baseball.length; ++j) {
                int strike = 0;
                int ball = 0;
                String b = String.valueOf(baseball[j][0]);

                for (int p = 0; p < b.length(); ++p) {
                    for (int q = 0; q < b.length(); ++q) {
                        if (a.charAt(p) - b.charAt(q) == 0 && p == q) {
                            strike++;
                        }
                        else if (a.charAt(p) - b.charAt(q) == 0 && p != q) {
                            ball++;
                        }
                    }
                }

                if (strike == baseball[j][1] && ball == baseball[j][2]) {
                    count++;
                }

                else if (strike != baseball[j][1] || ball != baseball[j][2]) {
                    break;
                }

            }
            if (count == baseball.length) {
                answer++;
            }

        }

        return answer;
    }

    public static String makeString(Ball ball) {
        StringBuilder sb = new StringBuilder();
        sb.append(ball.x);
        sb.append(ball.y);
        sb.append(ball.z);

        return sb.toString();
    }

    public static void main(String[] args) {
        int[][] baseball = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
        System.out.println(solution(baseball));
    }

}

class Ball {
    int x;
    int y;
    int z;

    public Ball(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
