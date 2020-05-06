package Programmers.Algorithm.Level3;

public class Network {

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visit = new boolean[n];

        for (int i = 0; i < n; ++i) {
            if (!visit[i]) {
                dfs(computers, visit, i);
                answer++;
            }
        }

        return answer;
    }

    public void dfs(int[][] computers, boolean[] visit, int v) {
        visit[v] = true;

        for (int w = 0; w < visit.length; ++w) {
            if (!visit[w] && computers[v][w] == 1) {
                dfs(computers, visit, w);
            }
        }
    }

}