package Programmers.Algorithm.카카오개발자겨울인턴십;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class BannedUser {
    private static Set<Set<String>> result;
    public static int solution(String[] user_id, String[] banned_id) {
        result = new HashSet<>();
        dfs(user_id, banned_id, new LinkedHashSet<>());
        return result.size();
    }

    static void dfs(String[] user_id, String[] banned_id, Set<String> set) {
        if (set.size() == banned_id.length) {
            if (isBannedUsers(set, banned_id)) {
                result.add(new HashSet<>(set));
            }
            return;
        }

        for (String userId : user_id) {
            if (!set.contains(userId)) {
                set.add(userId);
                dfs(user_id, banned_id, set);
                set.remove(userId);
            }
        }
    }

    static boolean isBannedUsers(Set<String> set, String[] banned_id) {
        int i = 0;

        for (String user : set) {
            if (!isSameString(user, banned_id[i++])) {
                return false;
            }
        }
        return true;
    }

    static boolean isSameString(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); ++i) {
            if ((a.charAt(i) != b.charAt(i)) && b.charAt(i) != '*') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] a = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
        String[] b = {"*rodo", "*rodo", "******"};
        System.out.println(solution(a, b));
    }
}
