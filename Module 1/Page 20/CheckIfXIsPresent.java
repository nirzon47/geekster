import java.util.*;

public class CheckIfXIsPresent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int testCase = sc.nextInt();

        int flag = 0;
        int high = n - 1;
        int low = 0;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == testCase) {
                flag = 1;
                break;
            } else if (arr[mid] > testCase)
                low = mid + 1;
            else
                high = mid - 1;
        }

        if (flag == 1)
            System.out.println("True");
        else
            System.out.println("False");

    }
}