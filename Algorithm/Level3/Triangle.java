package Programmers.Algorithm.Level3;

import java.util.Arrays;

public class Triangle {
    public static int solution(int[][] triangle) {
        int[][] copyTriangle = new int[triangle.length][triangle.length];
        copyTriangle[0][0] = triangle[0][0];

        // 대각선에 있는 값들 더하기
        for (int i = 1; i < copyTriangle.length; ++i) {
            copyTriangle[i][0] = copyTriangle[i - 1][0] + triangle[i][0];
            copyTriangle[i][i] = copyTriangle[i - 1][i - 1] + triangle[i][i];
        }

        for (int i = 2; i < triangle.length; ++i) {
            for (int j = 1; j < i; ++j) {
                copyTriangle[i][j] = Math.max(copyTriangle[i - 1][j - 1], copyTriangle[i - 1][j]) + triangle[i][j];
            }
        }

        int[] list = new int[triangle.length];

        for (int i = 0; i < triangle.length; ++i) {
            list[i] = copyTriangle[triangle.length - 1][i];
        }

        Arrays.sort(list);

        return list[triangle.length - 1];
    }

    public static void main(String[] args) {
        int[][] list = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(solution(list));
    }
}
