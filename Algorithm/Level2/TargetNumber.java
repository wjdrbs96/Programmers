package Programmers.Algorithm.Level2;

public class TargetNumber {
    static int answer;

    public static int solution(int[] numbers, int target) {
        DFS(numbers, target, 0);
        return answer;
    }

    public static void DFS(int[] numbers, int target, int k) {
        if (k == numbers.length) {
            int sum = 0;

            for (int n : numbers) {
                sum += n;
            }
            if (sum == target) {
                answer++;
            }

            return;
        }

        numbers[k] *= 1;
        DFS(numbers, target, k + 1);

        numbers[k] *= -1;
        DFS(numbers, target, k + 1);
    }

    public static void main(String[] args) {
        int[] list = {1, 1, 1, 1, 1};
        System.out.println(solution(list, 3));
    }
}
