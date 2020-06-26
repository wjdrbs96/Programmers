package Programmers.Algorithm.Level2;

public class JoyStick {
    public static int solution(String name) {
        int answer = 0;
        int exp = name.length() - 1;

        for (int i = 0; i < name.length(); ++i) {
            if (((int)name.charAt(i) - (int)('A')) > (1 + (int)('Z') - name.charAt(i))) {
                // A에서 Z를 거쳐서 가는게 빠른 경우
                answer += (1 + (int)('Z') - name.charAt(i));
            }
            else {
                // A에서 바로 오른쪽으로 가는경우가 빠른 경우
                answer += (int)name.charAt(i) - (int)('A');
            }

            // 매번 왼쪽으로 돌아가는게 빠른지, 오른쪽으로 가던 길로 가는게 빠른지 검사를 해서 결정해야함
            if (name.charAt(i) == 'A') {
                int nextIdx = i + 1; // 커서이동
                int countA = 0;
                while (nextIdx < name.length() && name.charAt(nextIdx) == 'A') {
                    countA ++;   // A의 개수 세기
                    nextIdx++;   // 커서 이동
                }

                // (i - 1) * 2 = A 이전까지 문자의 왕복 이동 횟수
                int tmp = (i - 1) * 2 + (name.length() - 1 - i - countA);
                if (exp > tmp) exp = tmp;
            }
        }

        answer += exp;
        return answer;
    }

    public static void main(String[] args) {
        String name = "JAN";
        System.out.println(solution(name));
    }

    /*BBBBAAAAABBB
    일 때 A를 찾고나서 A의 갯수를 세게되는 타이밍이 i = 4 이고
    A의 갯수 = 5
    문자열 총길이 =12 입니다.

    앞의 B 4개를 오른쪽으로갔다 왼쪽으로가는 왕복횟수를 계산하면 (i-1) *2 인데
            (i-1)은 가장 마지막 B의 index 입니다. i=4는 A의 인덱스니까 실제로는 커서를 움직이지 않을 위치이니까요

    그리고 나머지 A 다섯개 다음에 위치한 B 세개는 실제로 세보면 3번 움직여야합니다. 이는
    문자열 길이(12) - 왼쪽에서 찾은 B중 가장 마지막 B의 인덱스(4) - A의 갯수(5) 라고 보시면됩니다.
    해당 포스트의 글에서 countA는 실제로는 5개가 아닌 4까지만 세고있습니다. 그러므로 +1 해주어야합니다.

            (i-1)*2 - (length-i-(countA+1) 가 횡이동 수의 식인데
    조금만 풀어쓰면 해당 코드의
            (i-1)*2 - (length-i-1-countA)가 되어버리는거죠*/
}
