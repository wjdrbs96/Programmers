package Programmers.Algorithm.KAKAO_BLIND_RECRUITMENT_2020;

public class StringCompress {
    public static int solution(String s) {
        int answer = s.length();
        int len = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {
            String chunk = "";
            int count = 0;
            StringBuffer sb = new StringBuffer(len);

            for (int j = 0; j < len; j += i) {
                if (len - j < i) {                       // i + j > s.length() 보다 클 때 예외처리
                    sb.append(s.substring(j, len));
                    break;
                }

                String cur = s.substring(j, j + i);
                if (chunk.equals(cur)) {
                    count++;
                }
                else {
                    if (count > 1) {
                        sb.append(count).append(chunk);
                    }
                    else {
                        sb.append(chunk);
                    }
                    count = 1;
                    chunk = cur;
                }
            }

            if (count > 1) {
                sb.append(count).append(chunk);
            }
            else {
                sb.append(chunk);
            }

            answer = Math.min(sb.length(), answer);
            sb.setLength(0);
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("aabbaccc"));
    }
}
