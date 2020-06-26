package Programmers.Algorithm.Level2;

public class JoyStick {
    public static int solution(String name) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        // 처음에 name.length() 만큼 AAA~ 를 만들기
        for (int i = 0; i < name.length(); ++i) {
            sb.append("A");
        }

        for (int i = 0; i < name.length(); ++i) {
            if (name.charAt(i) == sb.toString().charAt(i)) {
                answer++;
            }

            else {
                // 문자가 다르면 A에서 시작해서 가는게 빠른지 Z부터 가서 가는게 빠른지 거리를 조사
                if (((int)name.charAt(i) - (int)('A')) > (1 + (int)('Z') - name.charAt(i))) {
                    // A에서 Z를 거쳐서 가는게 빠른 경우
                    answer += (1 + (int)('Z') - name.charAt(i));
                }
                else {
                    // A에서 바로 오른쪽으로 가는경우가 빠른 경우
                    answer += (int)name.charAt(i) - (int)('A');
                }
            }


            // 알파벳을 옮긴 후에 옆에 알파벳으로 옮기기 위해 커서 이동
            // 커서를 오른쪽으로 가는게 빠른지, 왼쪽으로 가는게 빠른지도 판단해야함
            answer++;

        }

        return answer;
    }
    public static void main(String[] args) {
        String name = "JEROEN";
        System.out.println(solution(name));
    }
}
