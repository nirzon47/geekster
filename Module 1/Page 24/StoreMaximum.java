import java.util.*;

public class StoreMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int left = 0, right = n - 1, water = 0;
        int maxLeft = arr[left];
        int maxRight = arr[right];

        while (left < right) {
            if (arr[left] <= arr[right]) {
                left++;
                maxLeft = Math.max(maxLeft, arr[left]);
                water += maxLeft - arr[left];
            } else {
                right--;
                maxRight = Math.max(maxRight, arr[right]);
                water += maxRight - arr[right];
            }
        }
        System.out.println(water);
    }
}
