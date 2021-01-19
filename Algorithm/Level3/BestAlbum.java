package Programmers.Algorithm.Level3;

import java.util.*;

public class BestAlbum {
    public static int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genresSum = new HashMap<>();      // 장르별 총 합

        for (int i = 0; i < plays.length; ++i) {
            if (genresSum.get(genres[i]) == null) {
                genresSum.put(genres[i], plays[i]);
            }
            else {
                genresSum.put(genres[i], genresSum.get(genres[i]) + plays[i]);
            }
        }

        List<Integer> answer = new ArrayList<>();
        List<String> setList = new ArrayList<>(genresSum.keySet());
        Collections.sort(setList, (o1, o2) -> genresSum.get(o2).compareTo(genresSum.get(o1)));  // 내림차순 정렬

        for (int i = 0; i < setList.size(); ++i) {
            String tempGenres = setList.get(i);
            int first = 0;
            int second = 0;
            int max = -1;

            for (int j = 0; j < genres.length; ++j) {
                if (tempGenres.equals(genres[j])) {
                    if (plays[j] > max) {
                        max = plays[j];
                        first = j;
                    }
                }
            }

            max = 0;

            for (int j = 0; j < genres.length; ++j) {
                if (tempGenres.equals(genres[j])) {
                    if (first != j && plays[j] > max) {
                        max = plays[j];
                        second = j;
                    }
                }
            }

            answer.add(first);
            if (max != -1) {
                answer.add(second);
            }
        }

        int[] l = new int[answer.size()];
        for (int i = 0; i < answer.size(); ++i) {
            l[i] = answer.get(i);
        }

        return l;
    }

    public static void main(String[] args) {
        String[] a = {"classic", "pop", "classic", "classic", "pop"};
        int[] b = {500, 600, 150, 800, 2500};
        int[] solution = solution(a, b);
        System.out.println(Arrays.toString(solution));
    }
}
