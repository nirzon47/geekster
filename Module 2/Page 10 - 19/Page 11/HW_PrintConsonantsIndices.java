import java.util.*;

public class HW_PrintConsonantsIndices {
    public static boolean isVowel(char ch) {
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u',
                    'A', 'E', 'I', 'O', 'U' -> {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            if (!isVowel(s.charAt(i))) {
                System.out.print(i + " ");
            }
        }
    }
}
