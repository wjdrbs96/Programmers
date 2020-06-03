package Programmers.Algorithm.Level2;

import java.util.ArrayList;
import java.util.List;

public class Printer_2 {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int p : priorities) {
            list.add(p);
        }

        return answer;



    }

    public static void main(String[] args) {
        int[] p = {2, 1, 3, 2};
        System.out.println(solution(p, 2));
    }
}
