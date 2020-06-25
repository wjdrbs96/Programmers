package Programmers.Algorithm.Level3;

public class LongPalindrome {
    public static int solution(String s) {
        char[] chr = s.toCharArray();

        for (int i = s.length(); i > 1; i--) {
            for (int j = 0; j + i <= s.length(); ++j) {
                boolean chk = true;
                for (int k = 0; k < i / 2; ++k) {
                    if (chr[j + k] != chr[j + i - k - 1]) {
                        chk = false;
                        break;
                    }
                }

                if (chk) return i;
            }

        }

        return 1;
    }


    public static void main(String[] args) {
        String s = "abacde";
        //String s = "abcdba";
        System.out.println(solution(s));
    }
}
