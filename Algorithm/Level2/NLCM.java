package Programmers.Algorithm.Level2;

public class NLCM {
    /*public static int solution(int[] arr) {
        int gcd = GCD(arr[0],arr[1]);
        for (int i = 2; i < arr.length; i++) {
            gcd = GCD(gcd, arr[i]);
        }

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = arr[i] / gcd;
        }

        int sum = 1;

        for (int i = 0; i < arr.length; ++i) {
            sum *= arr[i];
        }

        return sum * gcd;
    }

    public static int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return GCD(b, a % b);
    }*/

    public int solution(int[] arr) {
        int lcm = arr[0]; // @1

        for(int i = 1; i < arr.length; i++) { // @2
            lcm = getLcm(lcm, arr[i]);
        }

        return lcm;
    }

    public int getGcd(int a, int b) { // @3
        int tmp;
        while(b != 0) {
            tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public int getLcm(int a, int b) { // @4
        return a * b / getGcd(a, b);
    }

}
