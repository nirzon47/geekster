import java.util.*;

public class HW_FindDifference2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (Math.abs(arr[j] - arr[i]) == k)
                    System.out.println(arr[i] + " " + arr[j]);
            }
        }

    }
}