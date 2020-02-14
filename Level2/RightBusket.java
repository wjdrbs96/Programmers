package Programmers.Level2;

import java.util.Stack;

public class RightBusket {
    public static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                count++;
            }

            else {
                if (s.charAt(i) == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                    count--;
                }
            }

        }

        if (count == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution("((())())"));
    }
}
