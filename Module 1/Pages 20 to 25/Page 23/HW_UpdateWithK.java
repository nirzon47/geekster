import java.util.*;

public class HW_UpdateWithK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] > k) {
                if (arr[i] % 2 == 0)
                    arr[i] /= 2;
                else
                    arr[i] += k;
            }
            System.out.print(arr[i] + " ");
        }

    }
}