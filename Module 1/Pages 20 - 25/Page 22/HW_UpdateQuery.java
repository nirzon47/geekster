import java.util.*;

public class HW_UpdateQuery {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int l = sc.nextInt();
        int r = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i <= l)
                arr[i] += x;
            else if (i >= r)
                arr[i] += x;

            System.out.print(arr[i] + " ");
        }
    }
}