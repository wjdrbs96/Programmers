package Programmers.Level1;

import java.util.Arrays;

public class IntDSC {
    public static long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

        char[] list = s.toCharArray();
        Arrays.sort(list);


        for (int i = list.length - 1; i >= 0; --i) {
            sb.append(list[i]);
        }

        answer = Long.parseLong(sb.toString());

        return answer;
    }

}
