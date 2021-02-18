package Programmers.Algorithm.KaKao;

import java.util.ArrayList;
import java.util.List;

public class KakaoString {
    public int solution(String s) {
        List<Integer> l = new ArrayList<>();
        int count = 0;
        for (int i = 1; i <= s.length() / 2; ++i) {  // i 는 압축 단위
            String a = s.substring(0, i);  // 비교 대상
            count = 1;
            for (int j = i; j < s.length(); j += i) {
                String b = s.substring(j, 2 * j);
                if (a.equals(b)) {
                    count++;
                    continue;
                } else {
                    if (count > 1) {

                    } else {
                        break;
                    }
                }
            }
        }
        return 1;
    }
}
