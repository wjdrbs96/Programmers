package Programmers.Algorithm.Level2;

import java.util.Stack;

public class FeStick {
    public static int solution(String arrangement) {
        Stack<Character> stack = new Stack<>();

        int count = 0;
        for (int i = 0; i < arrangement.length(); ++i) {
            if (arrangement.charAt(i) == '(') {
                if (arrangement.charAt(i + 1) == ')') {
                    count += stack.size();
                    i = i + 1;
                } else {
                    stack.push(arrangement.charAt(i));
                }
            } else {
                count += 1;
                stack.pop();
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String arr = "()(((()())(())()))(())";
        System.out.println(solution(arr));
    }
}
