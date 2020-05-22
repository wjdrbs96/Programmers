package Programmers.Algorithm.KAKAO_BLIND_RECRUITMENT_2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BraKetChange {
    public static String solution(String p) {
        // 빈 문자열이면 return
        if (p.length() == 0) {
            return "";
        }

        // 이미 올바른 문자열이라면 return
        if (checkRight(p)) {
            return p;
        }

        // p를 u와 v로 나누기
        List<String> list = divideString(p);
        String u = list.get(0);
        String v = list.get(1);

        // 분리한 문자열 u가 올바른 문자열이라면
        if (checkRight(u)) {
            u += solution(v);
            return u;
        }

        // 올바른 문자열이 아니라면
        else {
            // 첫번째 문자와 마지막 문자 제거하기
            u = u.substring(1, u.length() - 1);
            v = solution(v);
            u = reverseString(u);
            u = "(" + v + ")" + u;
        }

        return u;
    }

    // 문자열 u와 v를 분리하기
    static List<String> divideString(String p) {
        List<String> list = new ArrayList<>();
        String u = "";
        String v = "";
        int open = 0;
        int close = 0;


        for (int i = 0; i < p.length(); ++i) {
            if (p.charAt(i) == '(') {
                open++;
            }
            else if (p.charAt(i) == ')') {
                close++;
            }

            if (open == close) {
                u = p.substring(0, i + 1);
                // u의 문자열이 전부를 가져간다면 v는 빈문자열이 됨
                if (i + 1 == p.length()) {
                    v = "";
                }
                else {
                    v = p.substring(i + 1);
                }
                list.add(u);
                list.add(v);
                break;
            }
        }
        return list;
    }

    // 올바른 괄호 문자열 판단
    static boolean checkRight(String p) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < p.length(); ++i) {
            if (p.charAt(i) == '(') {
                stack.push(p.charAt(i));
            }
            else if (p.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }

        return true;
    }

    static String reverseString(String u) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < u.length(); ++i) {
            if (u.charAt(i) == ')') {
                sb.append('(');
            }
            else if (u.charAt(i) == '(') {
                sb.append(')');
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        //System.out.println(solution("(()())()"));
        //System.out.println(solution(")("));
        System.out.println(solution("()))((()"));
    }
}
