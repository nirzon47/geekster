import java.util.*;

public class PrintFirstNonMatchingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            arr2[i] = sc.nextInt();

        int flag = 0, i;

        for (i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                flag = 1;
                break;
            }
        }

        if (flag == 1)
            System.out.println(i);

    }
}