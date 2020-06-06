package Programmers.Algorithm.Level3;

import java.util.LinkedList;
import java.util.List;

public class LineUpWay {
    // 참고 https://m.blog.naver.com/PostView.nhn?blogId=jwyoon25&logNo=221347789536&categoryNo=0&proxyReferer=http:%2F%2Fwww.google.com%2F
    public static int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> list = new LinkedList<>();
        int index = 0;
        long fac = 1;

        for (int i = 1; i <= n; ++i) {
            fac *= i;
            list.add(i);
        }

        k--;        // k = 1인 경우 생략

        while (n > 0) {
            fac /= n--;      // 첫번째 숫자를 제외하고 나머지 숫자들을 배열해서 나올 수 있는 경우의 수
            answer[index] = list.get((int)(k / fac));
            list.remove((int)(k / fac));
            k %= fac;                      // k 에 나머지를 저장
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] list = solution(3, 5);

        for (int l : list) {
            System.out.print(l + " ");
        }
    }
}
