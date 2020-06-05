package Programmers.Algorithm.Level2;

public class MakeMaxNumber {
    public static String solution(String number, int k) {
        char max;
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        if (number.charAt(0) == '0') return "0";

        // 첫번째 for => 반복 횟수
        for (int i = 0; i < number.length() - k; ++i) {
            max = '0';
            for (int j = idx; j <= k + i; ++j) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    idx = j + 1;
                }
            }

            sb.append(max);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("4177252841", 4));
    }
}
