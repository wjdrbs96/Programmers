package Programmers.Algorithm.Level2;

public class PhoneNumberList {
    public static boolean solution(String[] phone_book) {
        for (int i = 0; i < phone_book.length; ++i) {
            int len = phone_book[i].length();
            for (int j = 0; j < phone_book.length; ++j) {
                if (i == j) continue;
                if (phone_book[i].length() > phone_book[j].length()) continue;
                if (phone_book[i].equals(phone_book[j].substring(0, len))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] list = {"12","123","1235","567","88"};
        System.out.println(solution(list));
    }
}
