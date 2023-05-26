import java.util.*;

public class HW_PrintAllCompostieNumbers {

    static boolean isComposite(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int i;

        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (isComposite(arr[i])) {
                System.out.println(arr[i]);
            }
        }

    }
}