package Programmers.Algorithm.KAKAO_BLIND_RECRUITMENT_2018;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if (cacheSize == 0) return cities.length * 5;

        List<String> list = new ArrayList<>();

        for (String _city : cities) {
            String city = _city.toLowerCase();

            if (list.contains(city)) {
                list.remove(city);
                answer += 1;
            }
            else {
                if (list.size() == cacheSize) {
                    list.remove(0);
                }
                answer += 5;
            }

            list.add(city);
        }



        return answer;
    }

    public static void main(String[] args) {
        //String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        //String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};
        //String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        //String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(solution(5, cities));

    }
}
