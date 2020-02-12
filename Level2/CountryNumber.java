package Programmers.Level2;

public class CountryNumber {
    public String solution(int n) {
        String answer = "";
        int rest = 0;

        while (n > 0) {
            rest = n % 3;
            n /= 3;
            if (rest == 0) {
                rest = 4;
                n -= 1;
            }
            answer = rest + answer;
        }
        return answer;
    }
}
