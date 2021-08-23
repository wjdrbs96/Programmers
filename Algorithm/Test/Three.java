package Programmers.Algorithm.Test;

/**
 * created by jg 2021/07/04
 */
public class Three {
    public static int solution(String s, String t) {
        int result = 0;

        StringBuilder sb1 = new StringBuilder();
        sb1.append(s);

        StringBuilder sb2 = new StringBuilder();
        sb2.append(t);

        int tLen = t.length();
        boolean check = false;
        while (true) {
            if (sb1.length() < sb2.length()) {
                break;
            }
            for (int i = 0; i < sb1.length() - sb2.length() + 1; ++i) {
                if (sb1.substring(i, i + tLen).equals(t)) {
                    sb1.delete(i, i + tLen);
                    check = true;
                    break;
                }
            }

            result++;
            if (!check) {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "aaaaabbbbb";
        String t = "ab";
        System.out.println(solution(s, t));
    }
}
