import java.util.*;

public class HW_FindStartingIndicesOfAnagram {
    public static boolean checkOccurrences(String s, String t) {
        int[] map1 = new int[26];
        int[] map2 = new int[26];
        for (int i = 0; i < t.length(); i++) {
            map1[s.charAt(i) - 'a']++;
            map2[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (map1[i] != map2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (i + t.length() > s.length()) {
                break;
            }
            if (checkOccurrences(s.substring(i, i + t.length()), t)) {
                list.add(i);
            }
        }

        for (int i : list) {
            System.out.print(i + " ");
        }

    }
}
