package Programmers.Algorithm.Summer_Winter_Coding;

import java.math.BigInteger;

public class Square {
    public static long solution(int w,int h) {
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();

        return (((long)w * (long)h) - ((long)(w) + (long)(h) - gcd));
    }

    public static void main(String[] args) {
        System.out.println(solution(8, 12));
    }
}
