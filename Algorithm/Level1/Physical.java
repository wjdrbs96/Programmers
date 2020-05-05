package Programmers.Algorithm.Level1;

public class Physical {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        for (int i = 0; i < reserve.length; ++i) {
            for (int j = 0; j < lost.length; ++j) {
                if (reserve[i] == lost[j]) {
                    answer++;
                    reserve[i] = -1;
                    lost[j] = -1;
                    break;
                }
            }
        }


        for (int i = 0; i < reserve.length; ++i) {
            for (int j = 0; j < lost.length; ++j) {
                int k = reserve[i] - lost[j];

                if (k == 1 || k == -1) {
                    answer++;
                    lost[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] l = {4 ,5};
        int[] r = {3, 4};
        System.out.println(solution(5, l, r));
    }
}
