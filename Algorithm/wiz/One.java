package Programmers.Algorithm.wiz;

import java.util.HashSet;
import java.util.Set;

/**
 * created by Gyunny 2021/08/28
 */
public class One {
    public static int solution(String s) {
        int answer = 0;

        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); ++i) {
            set.add(String.valueOf(s.charAt(i)));
            for (int j = i + 1; j < s.length(); ++j) {
                String p = s.charAt(i) + s.substring(i + 1, j + 1);
                if (isPossibleString(p)) {
                    set.add(p);
                }
            }
        }

        return set.size();
    }

    private static boolean isPossibleString(String s) {
        System.out.println(s);
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); ++i) {
            set.add(s.charAt(i));
        }

        if (s.length() > set.size()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("zxzxz"));
    }
}
