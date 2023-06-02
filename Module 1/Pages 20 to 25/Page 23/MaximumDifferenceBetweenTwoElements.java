import java.util.*;

public class MaximumDifferenceBetweenTwoElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int maxDifference = -1;
        int minElement = arr[0];

        for (int i = 1; i < n; i++) {
            maxDifference = Math.max(arr[i] - minElement, maxDifference);
            minElement = Math.min(arr[i], minElement);
        }
        System.out.println(maxDifference);

    }
}