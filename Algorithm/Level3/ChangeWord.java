package Programmers.Algorithm.Level3;

import java.util.LinkedList;
import java.util.Queue;

public class ChangeWord {
    public static int solution(String begin, String target, String[] words) {
        int answer = 0;
        Queue<Word> queue = new LinkedList<>();
        boolean[] visited = new boolean[words.length];
        queue.add(new Word(begin, 0));

        while (!queue.isEmpty()) {
            Word w = queue.poll();
            if (w.word.equals(target)) {
                answer = w.count;
                break;
            }

            for (int i = 0; i < words.length; ++i) {
                if (!visited[i] && wordCheck(w.word, words[i])) {
                    visited[i] = true;
                    queue.add(new Word(words[i], w.count + 1));
                }
            }
        }

        return answer;
    }


    // 단어의 알파벳 차이가 1개만 나면 true, 2개이상이면 false
    static boolean wordCheck(String start, String end) {
        int count = 0;

        for (int i = 0; i < start.length(); ++i) {
            if (start.charAt(i) == end.charAt(i)) {
                count++;
            }
        }

        if (start.length() - 1 == count) return true;

        return false;
    }

    public static void main(String[] args) {
        String[] word = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(solution("hit", "cog", word));
    }
}

class Word {
    String word;
    int count;

    public Word(String word, int count) {
        this.word = word;
        this.count = count;
    }
}
