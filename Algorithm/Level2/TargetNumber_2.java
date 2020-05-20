package Programmers.Algorithm.Level2;

public class TargetNumber_2 {
    public static int solution(int[] numbers, int target) {
        int answer = dfs(numbers, target, 0, 0);

        return answer;
    }

    public static int dfs(int[] numbers, int target, int idx, int num) {
        if (idx == numbers.length) {
            return num == target ? 1 : 0;
        }

        return dfs(numbers, target, idx + 1, num + numbers[idx]) + dfs(numbers, target, idx + 1, num - numbers[idx]);
    }

    public static void main(String[] args) {
        int[] n = {1, 1, 1, 1, 1};
        System.out.println(solution(n, 3));
    }
}
