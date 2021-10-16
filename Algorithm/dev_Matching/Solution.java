package Programmers.Algorithm.dev_Matching;

/**
 * created by Gyunny 2021/10/16
 */
class Solution {
    public static String solution(String[] registered_list, String new_id) {
        for (int i = 0; i < registered_list.length; ++i) {

            if (checkId(registered_list, new_id)) {
                new_id = checkInt(new_id);
            } else {
                return new_id;
            }
        }

        return new_id;
    }

    private static String checkInt(String s) {
        StringBuilder sbInt = new StringBuilder();
        StringBuilder sbString = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                sbInt.append(s.charAt(i));
            } else {
                sbString.append(s.charAt(i));
            }
        }

        if (sbInt.length() > 0) {
            return sbString + String.valueOf(Integer.parseInt(sbInt.toString()) + 1);
        }

        return sbString.toString() + 1;
    }

    private static boolean checkId(String[] registered_list, String new_id) {
        for (int i = 0; i < registered_list.length; ++i) {
            if (new_id.equals(registered_list[i])) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] list = {"cow", "cow1", "cow2", "cow3", "cow4", "cow9", "cow8", "cow7", "cow6", "cow5"};
        //String[] l = {"bird99", "bird98", "bird101", "gotoxy"};
        String new_id = "cow";
        System.out.println(solution(list, new_id));
    }
}
