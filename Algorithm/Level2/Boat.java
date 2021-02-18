package Programmers.Algorithm.Level2;

import java.util.Arrays;

public class Boat {
    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int i = 0;
        int j = 0;
        for (j = people.length - 1; i < j; --j) {
            if (people[i] + people[j] <= limit) {
                answer++;
                i++;
            } else {
                answer++;
            }
        }

        if (i == j) answer++;

        return answer;
    }

    public static void main(String[] args) {
        int[] list = {70, 80, 50};
        System.out.println(solution(list, 100));
    }
}
