package Programmers.Algorithm.Level2;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNumber_2 {
    public static String solution(int[] numbers) {
        String answer = "";
        String[] list = new String[numbers.length];

        for (int i = 0; i < numbers.length; ++i) {
            list[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        // list[0] 가 0이라면 나머지도 0이기 때문에 필요함
        // 없다면 00000 이런 답 나옴
        if (list[0].equals("0")) return "0";

        for (int i = 0; i < list.length; ++i) {
            answer += list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        System.out.println(solution(numbers));
    }
}
