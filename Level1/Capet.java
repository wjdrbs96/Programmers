package Programmers.Level1;

public class Capet {

    public int[] solution(int brown, int red) {
        int result = brown + red;
        int[] answer = new int[2];

        for (int i = 3; i <= result; ++i) {
            if (result % i == 0) {
                int tmp = result / i;

                if ((tmp - 2) * (i - 2) == red) {
                    answer[0] = tmp;
                    answer[1] = i;
                    return answer;
                }
            }

        }
        return answer;
    }
}
