package Programmers.Algorithm.팁스타운2017;

public class ExpectMatch {
    public static int solution(int n, int a, int b) {
        int count = 1;
        int tmp = 0;

        // 당연히 a < b 인줄 알았는데 아닌 경우도 있다.
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        // 반복문으로 이진탐색 구현
        while (n > 1) {
            if ((a % 2 == 0 && b % 2 != 0 && a - b == 1) || (a % 2 != 0 && b % 2 == 0 && b - a == 1)) {
                break;
            }

            n = n / 2;
            if (a >= 2) {
                if (a % 2 == 0) {
                    a = a / 2;
                }
                else {
                    a = a / 2 + 1;
                }
            }
            if (b > 2) {
                if (b % 2 == 0) {
                    b = b / 2;
                }
                else {
                    b = b / 2 + 1;
                }
            }

            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(4, 1, 2));
    }
}


// 엄청 간단한 풀이

//class Solution {
//    public int solution(int n, int a, int b) {
//        int answer = 0;
//        while (a != b) {
//            b = b % 2 == 1 ? (b = b / 2 + 1) : (b = b / 2);
//            a = a % 2 == 1 ? (a = a / 2 + 1) : (a = a / 2);
//            answer++;
//        }
//        return answer;
//    }
//}