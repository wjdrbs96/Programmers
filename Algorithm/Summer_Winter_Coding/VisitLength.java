package Programmers.Algorithm.Summer_Winter_Coding;

public class VisitLength {
    private static boolean[][][][] visit = new boolean[11][11][11][11];
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, -1, 0, 1};
    private static int x, y;
    private static int x2, y2;

    public static int solution(String dirs) {
        int answer = 0;
        x = 5;          // -5 ~ 5 를 배열에서 0 ~ 10 = -5 ~ 5 라고 생각하고 중간은 5임
        y = 5;
        x2 = 5;
        y2 = 5;

        for (char ch : dirs.toCharArray()) {
            x = x2;   // 이동 했던 거리를 다시 출발점으로
            y = y2;   // 이동 했던 거리를 다시 출발점으로
            if (ch == 'L') {
                x2 = x + dx[0];
                y2 = y + dy[0];
            }
            else if (ch == 'D') {
                x2 = x + dx[1];
                y2 = y + dy[1];
            }
            else if (ch == 'R') {
                x2 = x + dx[2];
                y2 = y + dy[2];
            }
            else if (ch == 'U') {
                x2 = x + dx[3];
                y2 = y + dy[3];
            }

            // 범위를 범어나면 이동하기 전으로 돌아오기
            if (x2 < 0 || x2 > 10 || y2 < 0 || y2 > 10) {
                x2 = x;
                y2 = y;
                continue;
            }

            if (!visit[x][y][x2][y2]) {
                visit[x][y][x2][y2] = true; // 왔던 길 체크
                visit[x2][y2][x][y] = true; // 왔던 길 체크
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("ULURRDLLU"));
    }
}


