package Programmers.Algorithm.팁스타운2017;

import java.util.Stack;

public class PairRemove {

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}
