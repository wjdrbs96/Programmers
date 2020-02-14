package Programmers.Level2;

public class NextMax {
    public static int solution(int n) {
        int count1 = 0;
        int count2 = 0;
        String a = twoCal(n);
        for (int i = 0; i < a.length(); ++i) {
            if (a.charAt(i) == '1') count1++;
        }

        while (true) {
            n++;
            String b = twoCal(n);
            for (int i = 0; i < b.length(); ++i) {
                if (b.charAt(i) == '1') count2++;
            }

            if (count1 == count2) return n;
            count2 = 0;
        }
    }

    public static String twoCal(int n) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(n % 2);
            n = n / 2;
            if (n == 1) {
                sb.append(n);
                break;
            }

        }
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
