package Programmers.Algorithm.Level2;

import java.util.HashSet;
import java.util.Set;

public class PhoneKeyMon {
    public static int solution(int[] nums) {
        int answer = nums.length / 2;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; ++i) {
            set.add(nums[i]);
        }

        if (answer <= set.size()) {
            return answer;
        }

        return set.size();
    }

    public static void main(String[] args) {
        int[] list = {3, 1, 2, 3};
        System.out.println(solution(list));
    }
}


