package Programmers.Level2;

import java.util.Arrays;

public class MakeMin {
    public static int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        int k = B.length - 1;
        for (int i = 0; i < A.length; ++i) {
            answer += (A[i] * B[k]);
            k--;
        }

        return answer;

    }

    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {3,4};
        System.out.println(solution(A, B));
    }
}
