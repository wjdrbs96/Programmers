package Programmers.Level1;

public class MathPow {
    public static long solution(long n) {
        if (Math.sqrt(n) == Math.floor(Math.sqrt(n))) {
            return (long)Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
    }

}
