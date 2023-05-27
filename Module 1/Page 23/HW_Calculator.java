import java.util.*;

public class HW_Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int N = sc.nextInt();
        int res;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] + N <= 9) {
                arr[i] += N;
                N = 0;
                break;
            }
            res = arr[i] + N;
            arr[i] = res % 10;
            N = res / 10;
        }

        if (N != 0)
            System.out.print(N + " ");


        for (int j : arr) System.out.print(j + " ");

    }
}