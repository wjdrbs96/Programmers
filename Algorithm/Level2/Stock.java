package Programmers.Algorithm.Level2;

public class Stock {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length - 1; ++i) {
            int count = 0;
            for (int j = i + 1; j < prices.length; ++j) {
                if (prices[i] <= prices[j]) {
                    count++;
                }
                else {
                    count++;
                    break;
                }

            }

            answer[i] = count;
        }

        return answer;
    }

    public static void main(String[] args) {
        //int[] prices = {1, 2, 3, 2, 3};
        int[] prices = {1, 4, 3, 2, 2};
        int[] answer = solution(prices);

        for (int p : answer) {
            System.out.print(p + " ");
        }

    }
}
