package Programmers.Algorithm.KAKAO_BLIND_RECRUITMENT_2018;

public class DartGame {
    public static int solution(String dartResult) {
        int p = 0;
        int[] answer = new int[3];
        for (int i = 0; i < dartResult.length(); ++i) {
            char dartChar = dartResult.charAt(i);
            int dartInt = Character.getNumericValue(dartChar);


            if (dartInt >= 0 && dartInt <= 10) {
                if (dartInt == 1) {
                    if (Character.getNumericValue(dartResult.charAt(i + 1)) == 0) {
                        dartInt = 10;
                        i++;
                    }
                }
                answer[p] = dartInt;
            }
            else {
                if (dartChar == 'D') {
                    answer[p] = (int)Math.pow(answer[p], 2);
                    p++;
                }
                else if (dartChar == 'S') {
                    p++;
                }
                else if (dartChar == 'T') {
                    answer[p] = (int)Math.pow(answer[p], 3);
                    p++;
                }
                else if (dartChar == '#') {
                    answer[p - 1] = -answer[p - 1];
                }
                else if (dartChar == '*') {
                    if (p == 3) {
                        for (int j = 1; j < p; ++j) {
                            answer[j] = 2 * answer[j];
                        }
                        continue;
                    }
                    for (int j = 0; j < p; ++j) {
                        answer[j] = 2 * answer[j];
                    }

                }
            }

        }

        int sum = 0;
        for (int i = 0; i < answer.length; ++i) {
            sum += answer[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        //solution("1D2S#10S");
        //System.out.println(solution("1D2S3T*"));
        //System.out.println(solution("1T2D3D#"));
        System.out.println(solution("1S2D*3T"));
    }
}
