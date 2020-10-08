package Programmers.Algorithm.Level3;

import java.util.LinkedList;
import java.util.Queue;

public class WordChange {
    static int count = 0;

    public static int solution(String begin, String target, String[] words) {
        boolean[] visit = new boolean[words.length];

        Queue<WordCount> queue = new LinkedList<>();
        queue.offer(new WordCount(begin, 0));

        while (!queue.isEmpty()) {
            WordCount wordList = queue.poll();

            if (wordList.word.equals(target)) {
                return wordList.count;
            }

            for (int i = 0; i < words.length; ++i) {
                if (!visit[i] && checkWord(wordList.word, words[i])) {
                    visit[i] = true;
                    queue.offer(new WordCount(words[i], wordList.count + 1));
                }
            }
        }

        return 0;
    }

    static boolean checkWord(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); ++i) {
            if (a.charAt(i) == b.charAt(i)) {
                count++;
            }
        }

        if (count == a.length() - 1) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        //String[] words = {"hot", "dot", "dog", "lot", "log"};
        System.out.println(solution("hit", "cog", words));
    }
}

class WordCount {
    String word;
    int count;

    public WordCount(String word, int count) {
        this.word = word;
        this.count = count;
    }
}


