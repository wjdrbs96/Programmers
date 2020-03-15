package Programmers.Algorithm.Level1;

public class StringCount {
    public boolean solution(String s) {
        boolean answer = true;

        int[] count = new int[2];

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                count[0] += 1;
            }
            else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                count[1] += 1;
            }
        }

        if (count[0] == count[1]) {
            return true;
        } else {
            return false;
        }
    }
}
