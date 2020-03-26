package Programmers.Algorithm.Summer_Winter_Coding;

import java.util.ArrayList;
import java.util.List;

public class EnglishWordChain {
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        list.add(words[0]);

        for (int i = 1; i < words.length; ++i) {

            if (!list.contains(words[i]) && words[i - 1].charAt(words[i - 1].length() - 1) == words[i].charAt(0)) {
                list.add(words[i]);
            }

            else {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        String[] list = {"hello","one","even","never","now","world","draw"};
        //String[] answer = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        solution(2, list);
        //String[] call = {"hello","observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish",
                         //"hang", "gather", "refer", "reference", "estimate", "executive"};
        //solution(5, call);
    }
}
