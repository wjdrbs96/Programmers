package Programmers.Algorithm.KAKAO_BLIND_RECRUITMENT_2018;

import java.util.LinkedList;
import java.util.List;

public class News {
    public static int solution(String str1, String str2) {
        double answer = 0.0;
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();

        for (int i = 0; i < str1.length() - 1; ++i) {
            String s = str1.substring(i, i + 2).toLowerCase();
            for (int j = 0; j < s.length(); ++j) {
                if ((s.charAt(j) >= 97 && s.charAt(j) <= 122)) {
                    if (s.charAt(j + 1) >= 97 && s.charAt(j) <= 122) {
                        list1.add(s);
                    }
                    break;
                }
                break;
            }
        }

        for (int i = 0; i < str2.length() - 1; ++i) {
            String s = str2.substring(i, i + 2).toLowerCase();
            for (int j = 0; j < s.length(); ++j) {
                if ((s.charAt(j) >= 97 && s.charAt(j) <= 122)) {
                    if (s.charAt(j + 1) >= 97 && s.charAt(j) <= 122) {
                        list2.add(s);
                    }
                    break;
                }
                break;
            }
        }


        List<Integer> check = new LinkedList<>();                       // 교집합 체크
        int intersection = 0;
        for (int i = 0; i < list1.size(); ++i) {
            for (int j = 0; j < list2.size(); ++j) {
                if (list1.get(i).equals(list2.get(j)) && !check.contains(j)) {
                    check.add(j);
                    intersection++;
                    break;
                }
            }
        }

        int union = list1.size() + list2.size() - intersection;

        if (union == 0 && intersection == 0) {
            answer = 1.0;
        }
        else {
            answer = (double)intersection / (double)union;
        }

        return (int)(answer * 65536);
    }


    public static void main(String[] args) {
        System.out.println(solution("E=M*C^1abc2", "e=m*c^2defg2"));
        //System.out.println(solution("handshake", "shake hands"));
        //System.out.println(solution("aa1+aa2", "AAAA12"));
        //System.out.println(solution("FRANCE", "french"));
    }
}
