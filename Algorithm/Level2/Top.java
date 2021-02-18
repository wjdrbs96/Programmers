package Programmers.Algorithm.Level2;

public class Top {
    public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        for (int i = 1; i < heights.length; ++i) {
            for (int j = i - 1; j >= 0; --j) {
                if (heights[i] < heights[j]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        //int[] heights = {6, 9, 5, 7, 4};
        int[] heights = {3, 9, 9, 3, 5, 7, 2};
        solution(heights);
    }
}
