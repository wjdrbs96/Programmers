package Programmers.Algorithm.Level3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FarthestNode {
    static int[] checkValue;
    static boolean[][] adj;

    public static int solution(int n, int[][] edge) {
        int answer = 0;

        checkValue = new int[n + 1];
        adj = new boolean[n + 1][n +1];

        for (int i = 0; i < edge.length; ++i) {
            adj[edge[i][0]][edge[i][1]] = true;
            adj[edge[i][1]][edge[i][0]] = true;
        }


        bfs(n, 1);

        Arrays.sort(checkValue);

        for (int a : checkValue) {
            if (checkValue[n] == a) {
                answer++;
            }
        }


        return answer;
    }

    static void bfs(int n, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int q = queue.poll();

            for (int i = 2; i < n + 1; ++i) {
                if (checkValue[i] == 0 && adj[q][i] == true) {
                    checkValue[i] += checkValue[q] + 1;
                    queue.offer(i);
                }
            }
        }

    }


    public static void main(String[] args) {
        int[][] list = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        System.out.println(solution(6, list));
    }
}
