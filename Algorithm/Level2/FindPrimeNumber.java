package Programmers.Algorithm.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPrimeNumber {
    static int[] list;
    public static int solution(String numbers) {
        char[] ch = numbers.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder();

        // numbers로 만들 수 있는 가장 큰 수 만들기
        for (int i = ch.length - 1; i >= 0; --i) {
            sb.append(ch[i]);
        }

        int n = Integer.parseInt(sb.toString());
        list = new int[n + 1];

        for (int i = 2; i < list.length; ++i) {
            list[i] = i;
        }

        List<Integer> l = new ArrayList<>();
        isPrime();

        for (int i = 2; i < list.length; ++i) {
            if (list[i] == 0) continue;
            if (isCheck(sb.toString(), list[i])) {
                l.add(list[i]);
            }
        }

        return l.size();
    }

    // 에라토스테네체로 소수 판별
    public static void isPrime() {
        for (int i = 2; i < list.length; ++i) {
            if (list[i] == 0) continue;
            for (int j = 2 * i; j < list.length; j += i) {
                list[j] = 0;
            }
        }
    }

    // 소수가 numbers로 만들 수 있는 소수인지 체크
    public static boolean isCheck(String p, int n) {
        char[] ch = p.toCharArray();
        String s = String.valueOf(n);
        int count = 0;

        for (int i = 0; i < s.length(); ++i) {
            for (int j = 0; j < ch.length; ++j) {
                if (s.charAt(i) == ch[j]) {
                    ch[j] = ',';
                    count++;
                    break;
                }
            }
        }

        if (count == s.length()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "17";
        System.out.println(solution(s));
    }
}
