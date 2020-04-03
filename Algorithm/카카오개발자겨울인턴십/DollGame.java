package Programmers.Algorithm.카카오개발자겨울인턴십;

import java.util.Stack;

public class DollGame {
    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < moves.length; ++i) {
            for (int j = 0; j < board.length; ++j) {
                if (board[j][moves[i] - 1] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[j][moves[i] - 1]) {
                        stack.pop();
                        board[j][moves[i] - 1] = 0;
                        count++;
                        break;
                    }
                    stack.push(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }

        }
        return 2 * count;
    }

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] move = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board, move));
    }
}
