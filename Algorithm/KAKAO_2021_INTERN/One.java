package Programmers.Algorithm.KAKAO_2021_INTERN;

/**
 * created by Gyunny 2022/03/17
 */
public class One {
    public static int solution(String s) {
        String[] numbers = {
                "zero","one","two",
                "three","four","five","six",
                "seven","eight","nine"
        };

        for (int i = 0; i < numbers.length; ++i) {
            s = s.replaceAll(numbers[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}
