package Programmers.Algorithm.channel;

/**
 * created by Gyunny 2021/09/09
 */
class One {
    public static int solution(int[][] locations) {
        for (int i = 0; i < locations.length; ++i) {
            int a = locations[i][0];
            int b = locations[i][1];

            if (a == 2 && b == 2) {
                return -1;
            }
        }

        return 2;
    }

    public static void main(String[] args) {
        int[][] list = {{2,2}, {1,3}};
        System.out.println(solution(list));
    }
}