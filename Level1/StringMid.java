package Programmers.Level1;

public class StringMid {
    public static String solution(String s) {

        if (s.length() % 2 == 0) {
            return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }

        return s.substring(s.length() / 2, s.length() / 2 + 1);
    }

}
