package Programmers.Algorithm.channel;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by Gyunny 2021/09/09
 */
public class Two {
    private static boolean[][] visit;
    private static int N, M;
    private static int[][] adj;
    private static int[] dx = {1, -1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};
    private static int checkCount = 250;

    // 0 빈공간
    // 1 민수의 노란 차
    // 2 빨간 자동차 (움직이기 가능)
    // 3 검은 자동차 (움직이기 불가능)
    // 4 출구
    public static int solution(int[][] cars) {
        int answer = 0;
        N = cars.length;
        M = cars[0].length;

        adj = new int[N + 1][M + 1];
        //visit = new boolean[N + 1][M + 1];
        Queue<Car> queue = new LinkedList<>();

        for (int i = 0; i < cars.length; ++i) {
            for (int j = 0; j < cars[i].length; ++j) {
                // 빨간차
                if (cars[i][j] == 2) {
                    adj[i + 1][j + 1] = 1;
                } else if (cars[i][j] == 3) {
                    adj[i + 1][j + 1] = 5;
                } else if (cars[i][j] == 4) {
                    adj[i + 1][j + 1] = 2;
                } else if (cars[i][j] == 1) {
                    Car car = new Car(i + 1, j + 1, 0);
                    adj[car.x][car.y] = 3;
                    queue.add(car);
                    //visit[car.x][car.y] = true;
                }
            }
        }

        for (int i = 1; i < adj.length; ++i) {
            for (int j = 1; j < adj.length; ++j) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }

        // 민수 차 3
        // 출구 2
        // 빨간차 1
        // 빈 공간 0
        while (!queue.isEmpty()) {
            Car car = queue.poll();
            int p = car.x;
            int q = car.y;
            int dist = car.exitCount;

            if (checkCount < 0) return car.exitCount;

            for (int i = 0; i < 4; ++i) {
                checkCount--;
                int nx = dx[i] + p;
                int ny = dy[i] + q;

                if (nx > 0 && nx < N + 1 && ny > 0 && ny < M + 1 && adj[nx][ny] != 5) {
                    // 빈 공간
                    if (adj[nx][ny] == 0) {
                        queue.add(new Car(nx, ny, dist));
                    }

                    // 빨간차
                    if (adj[nx][ny] == 1) {
                        queue.add(new Car(nx, ny, dist + 1));
                    }

                    //visit[nx][ny] = true;
                    System.out.println(nx + " " + ny + " " + dist);

                    // 출구 만나면 그만
                    if (adj[nx][ny] == 2) {
                        System.out.println(dist);
                    }
                }

            }
        }

        return answer;
    }


    public static void main(String[] args) {
        int[][] list = {{0,2,0,0,0},{0,4,2,0,0},{0,2,0,0,0},{0,0,0,2,1},{0,0,0,2,0}};
        int[][] test = {{0,0,3,0,0,0,0},{1,0,3,0,0,0,0},{0,0,3,0,0,0,0},{0,0,2,0,0,3,3},{2,2,2,0,2,0,0},{3,3,2,0,2,0,3},{3,3,2,0,2,0,4}};
        System.out.println(solution(test));
    }
}

class Car {
    int x;
    int y;
    int exitCount;

    public Car(int x, int y, int exitCount) {
        this.x = x;
        this.y = y;
        this.exitCount = exitCount;
    }
}
