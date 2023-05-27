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
            if (arr[i] - minElement > maxDifference)
                maxDifference = arr[i] - minElement;
            if (arr[i] < minElement)
                minElement = arr[i];
        }
        System.out.println(maxDifference);

    }
}