package Programmers.Algorithm.KAKAO_BLIND_RECRUITMENT_2018;

public class SecretMap {

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];

        for (int i = 0; i < n; ++i) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);   // 비트연산자 양쪽 비트 중 어느 하나라도 1이면 결과가 1이 되고 모두 0일 때만 0이 됨
        }

        for (int i = 0; i < n; ++i) {
            System.out.println(result[i]);
        }

        for (int i = 0; i < n; ++i) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1","#");
            result[i] = result[i].replaceAll("0"," ");
        }


        return result;
    }

    /*public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        Stack<Integer> stack1 = new Stack<>();

        int q = 0;
        for (int i = 0; i < answer.length; ++i) {
            answer[i] = "";
        }

        for (int i = 0; i < arr1.length; ++i) {
            String save1 = "";
            String save2 = "";
            while (arr1[i] != 1) {
                stack1.push(arr1[i] % 2);
                arr1[i] = arr1[i] / 2;

            }
            stack1.push(arr1[i]);

            while (!stack1.isEmpty()) {
                save1 += stack1.pop();
            }

            if (save1.length() < n) {
                int m = n - save1.length();
                while (m > 0) {
                    save1 = "0" + save1;
                    m--;
                }
            }

            while (arr2[i] != 1) {
                stack1.push(arr2[i] % 2);
                arr2[i] = arr2[i] / 2;
            }
            stack1.push(arr2[i]);

            while (!stack1.isEmpty()) {
                save2 += stack1.pop();
            }
            if (save2.length() < n) {
                int m = n - save2.length();
                while (m > 0) {
                    save2 = "0" + save2;
                    m--;
                }
            }

            System.out.println(save2);

            for (int j = 0; j < save1.length(); ++j) {
                if (save1.charAt(j) == '0' && save2.charAt(j) == '0') {
                    answer[q] += " ";
                }
                else {
                    answer[q] += "#";
                }
            }
            q++;

        }
        return answer;
    }*/

    public static void main(String[] args) {
        //int[] arr1 = {9, 20, 28, 18, 11};
        //int[] arr2 = {30, 1, 21, 17, 28};
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};

        String[] list = solution(6, arr1, arr2);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
