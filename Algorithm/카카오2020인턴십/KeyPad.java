package Programmers.Algorithm.카카오2020인턴십;

import java.util.HashMap;
import java.util.Map;

public class KeyPad {
    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, Location> hm = new HashMap<>();

        hm.put(0, new Location(1, -3));
        hm.put(1, new Location(0, 0));
        hm.put(2, new Location(1, 0));
        hm.put(3, new Location(2, 0));
        hm.put(4, new Location(0, -1));
        hm.put(5, new Location(1, -1));
        hm.put(6, new Location(2, -1));
        hm.put(7, new Location(0, -2));
        hm.put(8, new Location(1, -2));
        hm.put(9, new Location(2, -2));

        Location left = new Location(0, -3);
        Location right = new Location(2, -3);

        for (int i : numbers) {
            if (i == 1 || i == 4 || i == 7) {
                sb.append("L");
                left = hm.get(i);
            }
            else if (i == 3 || i == 6 || i == 9) {
                sb.append("R");
                right = hm.get(i);
            }
            else {
                Location now = hm.get(i);
                int leftSum = Math.abs(now.x - left.x) + Math.abs(now.y - left.y);
                int rightSum = Math.abs(now.x - right.x) + Math.abs(now.y - right.y);

                // 왼손이 더 멀 때
                if (leftSum > rightSum) {
                    sb.append("R");
                    right = now;
                }
                // 오른손이 더 멀 때
                else if (leftSum < rightSum) {
                    sb.append("L");
                    left = now;
                }
                // 거리가 같을 때
                else {
                    // 왼손잡이라면
                    if (hand.equals("left")) {
                        sb.append("L");
                        left = now;
                    }
                    else {
                        sb.append("R");
                        right = now;
                    }
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        //int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        System.out.println(solution(numbers, "left"));
    }
}

class Location {
    int x;
    int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
