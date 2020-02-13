package Programmers.Level1;

public class HaShad {
    public boolean solution(int x) {
        int sum = 0;

        int a = x;
        while (a > 0) {
            sum += a % 10;
            a = a / 10;
        }

        if (x % sum == 0) return true;
        return false;
    }
}
