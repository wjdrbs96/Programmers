package Programmers.Algorithm.Summer_Winter_Coding;

public class JumpTeleport {
    public static int solution(int n) {
        int ans = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            else {
                n = n - 1;
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(5);
    }
}
