package Programmers.Level1;

public class PhoneNumber {
    public static String solution(String phone_nunber) {
        int n = phone_nunber.length() - 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= n - 4; ++i) {
            sb.append("*");
        }

        sb.append(phone_nunber.substring(n - 3));
        return sb.toString();
    }

}
