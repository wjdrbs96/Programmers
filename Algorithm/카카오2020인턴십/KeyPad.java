package Programmers.Algorithm.카카오2020인턴십;

import java.util.HashMap;
import java.util.Map;

/**
 * created by jg 2021/04/18
 */
public class KeyPad {
    public static String solution(int[] numbers, String hand) {

        Map<Integer, Distance> map = new HashMap<>();

        // mid
        map.put(2, new Distance(1, 3));
        map.put(5, new Distance(1, 2));
        map.put(8, new Distance(1, 1));
        map.put(0, new Distance(1, 0));

        // left
        map.put(1, new Distance(0, 3));
        map.put(4, new Distance(0, 2));
        map.put(7, new Distance(0, 1));

        // right
        map.put(3, new Distance(2, 3));
        map.put(6, new Distance(2, 2));
        map.put(9, new Distance(2, 1));

        StringBuilder sb = new StringBuilder();
        Distance left = new Distance(0, 0);
        Distance right = new Distance(2, 0);

        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                sb.append("L");
                left = map.get(numbers[i]);
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                sb.append("R");
                right = map.get(numbers[i]);
            } else {
                // 누가 더 가까운지 비교
                Distance distance = map.get(numbers[i]);
                int midX = distance.x;
                int midY = distance.y;

                int leftX = left.x;
                int leftY = left.y;
                int rightX = right.x;
                int rightY = right.y;

                int sumLeft = Math.abs(midX - leftX) + Math.abs(midY - leftY);
                int sumRight = Math.abs(midX - rightX) + Math.abs(midY - rightY);

                if (sumLeft < sumRight) {
                    sb.append("L");
                    left = distance;
                } else if (sumLeft > sumRight) {
                    sb.append("R");
                    right = distance;
                } else {
                    if (hand.equals("right")) {
                        sb.append("R");
                        right = distance;
                    } else if (hand.equals("left")){
                        sb.append("L");
                        left = distance;
                    }
                }

            }
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        //int[] number = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        int[] number = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        System.out.println(solution(number, "left"));
    }
}

class Distance {
    int x;
    int y;

    public Distance(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
