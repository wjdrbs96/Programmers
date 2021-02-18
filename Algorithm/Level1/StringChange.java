package Programmers.Level1;

import java.util.Scanner;

public class StringChange {
    public static int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();

        System.out.println(solution(s));
    }
}
