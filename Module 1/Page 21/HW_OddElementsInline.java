import java.util.*;

public class HW_OddElementsInline {

    static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int i;

        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (isOdd(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}