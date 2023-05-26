import java.util.*;

public class PrintLastIndexOfX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int key = sc.nextInt();

        int flag = 0, i;

        for (i = n - 1; i > -1; i--) {
            if (arr[i] == key) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println(i);
        else
            System.out.println(-1);

    }
}