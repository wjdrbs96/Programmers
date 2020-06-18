package Programmers.Algorithm.Summer_Winter_Coding;

public class MakePrime {
    public static int solution(int[] nums) {
        int answer = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 2; ++i) {
            for (int j = i + 1; j < nums.length - 1; ++j) {
                for (int k = j + 1; k < nums.length; ++k) {
                    answer = nums[i] + nums[j] + nums[k];
                    if (isPrime(answer)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        //int[] list = {1, 2, 3, 4};
        int[] list = {1, 2, 7, 6, 4};
        System.out.println(solution(list));
    }
}
