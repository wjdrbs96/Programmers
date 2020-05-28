package Programmers.Algorithm.Level2;

import java.util.ArrayList;
import java.util.List;

// 8번 16번 틀림..
public class JadenCase {
    public static String solution(String s) {
        String[] answer = s.toLowerCase().split(" ");
        List<String> list = new ArrayList<>();

        for (int i = 0; i < answer.length; ++i) {
            char[] ch = answer[i].toCharArray();
            for (int j = 0; j < ch.length; ++j) {
                if (ch[j] >= 97 && ch[j] <= 122) {
                    ch[j] = (char)(ch[j] - 32);
                    break;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < ch.length; ++k) {
                sb.append(ch[k]);
            }

            list.add(sb.toString());
        }

        StringBuilder sbd = new StringBuilder();
        for (String na : list) {
            sbd.append(na);
            sbd.append(" ");
        }

        return sbd.toString().trim();
    }

    public static void main(String[] args) {
        String s = "3people unFollowed me";
        System.out.println(solution(s));
    }
}

/*
// 성공코드
public String solution(String s) {
      String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
  }
* */
