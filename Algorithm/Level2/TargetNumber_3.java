package Programmers.Algorithm.Level2;

// 잘 안 풀리는 유형
public class TargetNumber_3 {
    static int count = 0;

    public static int solution(int[] numbers, int target) {
        dfs(numbers, target, 0);

        return count;
    }

    static void dfs(int[] numbers, int target, int k) {
        // 처음부터 끝까지 탐색
        if (k == numbers.length) {
            int sum = 0;

            for (int n : numbers) {
                sum += n;
            }

            if (sum == target) {
                count++;
            }
            return;
        }

        dfs(numbers, target, k + 1);
        numbers[k] *= -1;
        dfs(numbers, target, k + 1);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1, 1};
        System.out.println(solution(numbers, 2));
    }
}
