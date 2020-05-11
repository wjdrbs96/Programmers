package Programmers.Algorithm.Summer_Winter_Coding;

public class SkillTree {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (int i = 0; i < skill_trees.length; ++i) {
            answer += check(skill, skill_trees[i]);
            System.out.println();
        }

        return answer;
    }

    public static int check(String skill, String skill_trees) {
        int index = 0;
        int k = 0;

        for (int i = 0; i < skill.length(); ++i) {
            for (k = 0; k < skill_trees.length(); ++k) {
                if (skill.charAt(i) == skill_trees.charAt(k)) {
                    // 인덱스가 역순이면 순서 오류
                    if (index > k) {
                        return 0;
                    }

                    index = k;
                    break;
                }
            }

            // skill 의 문자와 skill_trees 배열 원소의 문자와 같은 것이 존재하지 않을 때
            index = k;
        }

        return 1;
    }

    public static void main(String[] args) {
        String skill = "CBD";
        //String[] skill_trees = {"CBADF"};
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution(skill, skill_trees));
    }
}
