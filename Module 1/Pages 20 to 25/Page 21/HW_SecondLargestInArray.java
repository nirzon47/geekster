import java.util.*;

public class HW_SecondLargestInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int max = arr[n - 1];

        if (arr[0] == max)
            System.out.println(-2147483648);
        else {
            for (int i = n - 1; i > -1; i--) {
                if (arr[i] != max) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }


    }
}