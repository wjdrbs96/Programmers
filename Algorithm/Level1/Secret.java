package Programmers.Level1;

public class Secret {
    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        int k = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ' ') {
                sb.append(' ');
                continue;
            }
            k = ((int)s.charAt(i) + n);

            if (k > 90 && k < 97) {
                k = k - 26;
            }
            else if (k > 122) {
                k = k -26;
            }

            char a = (char)(k);
            sb.append(a);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("abc", 25));
    }
}
