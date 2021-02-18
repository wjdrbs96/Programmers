package Programmers.Algorithm.Level1;

public class MinRemove {
    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; ++i) {
            min = Math.min(arr[i], min);
        }

        int[] answer = new int[arr.length - 1];

        int k = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == min) {
                k++;
                continue;
            }
            answer[i - k] = arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] ary = {1, 2, 3, 4};
        ary = solution(ary);

        for (int k : ary) {
            System.out.print(k + " ");
        }
    }

}
