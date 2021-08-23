package Programmers.Algorithm.Test;

import java.util.Arrays;

/**
 * created by jg 2021/07/04
 */
public class One {
    public static int solution(int[] prices, int[] discounts) {
        int answer = 0;
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int priceLen = prices.length;
        int discountLen = discounts.length;

        for (int i = discountLen - 1; i >= 0; --i) {
            for (int j = priceLen - 1; j >= 0; --j) {
                if (prices[j] > 0 && discounts[i] > 0) {
                    answer += ((prices[j] / 100) * (100 - discounts[i]));
                    prices[j] = 0;
                    discounts[i] = 0;
                }
            }
        }

        if (priceLen > discountLen) {
            for (int i = 0; i < priceLen - discountLen; ++i) {
                answer += prices[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] prices = {32000, 18000, 42500};
        int[] result = {50, 20, 65, 40};

        System.out.println(solution(prices, result));
    }
}
