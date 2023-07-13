import java.util.*;

public class SearchCharacter {
    public static char findCharacter(char[] letters, int target) {
        char res = letters[0];
        int left = 0, right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                res = letters[mid];
                right = mid - 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char check = sc.next().charAt(0);
        int n = sc.nextInt();
        char[] chars = new char[n];

        for (int i = 0; i < n; i++) {
            chars[i] = sc.next().charAt(0);
        }

        char res = findCharacter(chars, check);
        if (check > chars[n - 1]) {
            System.out.println(-1);
        } else {
            System.out.println(res);
        }

    }
}
