package Programmers.Level1;

public class Melon {
    public static String solution(int n) {
        StringBuilder sb1 = new StringBuilder("수");
        StringBuilder sb2 = new StringBuilder("수박");

        if (n % 2 == 0) {
            for (int i = 1; i < n / 2; ++i) {
                sb2.append("수박");
            }
            return sb2.toString();
        }

        for (int i = 0; i < n / 2; ++i) {
            sb1.append("박수");
        }

        return sb1.toString();






    }
}
