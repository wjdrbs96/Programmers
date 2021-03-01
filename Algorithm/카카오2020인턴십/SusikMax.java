package Programmers.Algorithm.카카오2020인턴십;

import java.util.*;

public class SusikMax {
    public static long answer = Long.MIN_VALUE;

    public static List<Long> numList = new ArrayList<>(); // 숫자 담을 리스트
    public static List<String> operList = new ArrayList<>(); // 연산자 담을 리스트

    public static String[] oper = {"+", "-", "*"};
    public static String[] output = new String[3]; // 순열 결과 담을 배열
    public static boolean[] visited = new boolean[3];

    public static long solution(String expression) {
        String n = "";
        for (int i = 0; i < expression.length(); i++) {
            char exp = expression.charAt(i);
            if (exp == '+' || exp == '-' || exp == '*') {
                operList.add(exp + "");
                numList.add(Long.parseLong(n));
                n = "";
            } else {
                n += exp;
            }
        }

        // 마지막 숫자 삽입
        numList.add(Long.parseLong(n));

        //순열 만들기
        per(0, oper.length);

        return answer;
    }

    //순열 찾기
    static void per(int depth, int r) {
        if (depth == r) {
            solve(); // 연산

            return;
        }

        for (int i = 0; i < oper.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = oper[i];
                per(depth + 1, r);
                visited[i] = false;
            }
        }
    }

    // 연산
    static void solve() {
        // 연산자 우선 순위에 따른 값을 얻기 위해 List 복사
        List<String> oper = new ArrayList<>();
        oper.addAll(operList);

        List<Long> num = new ArrayList<>();
        num.addAll(numList);

        for (int i = 0; i < output.length; i++) {
            String curOper = output[i]; // 현재 우선순위 연산자

            for (int j = 0; j < oper.size(); j++) {

                if (oper.get(j).equals(curOper)) { // 현재 우선순위에 맞는 연산자일 경우
                    long n1 = num.get(j);
                    long n2 = num.get(j + 1);
                    long res = cal(n1, n2, curOper);


                    num.remove(j + 1); // 숫자 삭제
                    num.remove(j);
                    oper.remove(j); // 연산자 삭제


                    num.add(j, res); // 연산 결과 넣기

                    j--; // 삭제했으니 인덱스 하나 줄여주기
                }
            }
        }

        answer = Math.max(answer, Math.abs(num.get(0)));
    }

    // 수식 계산
    static long cal(long n1, long n2, String o) {
        long res = 0;
        switch (o) {
            case "+" :
                res = n1 + n2;
                break;
            case "-" :
                res = n1 - n2;
                break;
            case "*" :
                res = n1 * n2;
                break;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(solution("100-200*300-500+20"));
    }

}