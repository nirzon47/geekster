import java.util.*;

public class SearchCharacter {
    public static int findCharacter(char[] chars, int n, int check) {
        int left = 0, right = n - 1, res = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (chars[mid] < check) {
                left = mid + 1;
            } else if (chars[mid] > check) {
                right = mid - 1;
            } else {
                res = mid;
                left = mid + 1;
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

        int position = findCharacter(chars, n, check);

        if (position == -1) {
            for (int i = 0; i < n; i++) {
                if (chars[i] > check) {
                    System.out.println(chars[i]);
                    return;
                }
            }
            System.out.println(-1);
            return;
        }

        if (position + 1 == n) {
            System.out.println(-1);
        } else {
            System.out.println(chars[position + 1]);
        }

    }
}
