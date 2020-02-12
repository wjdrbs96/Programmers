package Programmers.Level1;

public class StringTrue {
    public static boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;

        for (int i = 0; i < s.length(); ++i) {
            if ((int)s.charAt(i) < 48 || (int)s.charAt(i) > 57) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        if (solution("0-012233")) {
            System.out.println("ㅅㅂ");
        } else {
            System.out.println("mg");
        }
    }
}
