import java.util.*;

public class HW_ProductOfArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int product = 1;

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }

        System.out.println(product);

    }
}