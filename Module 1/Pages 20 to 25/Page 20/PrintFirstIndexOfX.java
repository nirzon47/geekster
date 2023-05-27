import java.util.*;

public class PrintFirstIndexOfX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int testCase = sc.nextInt();

        int flag = 0, i;

        for (i = 0; i < n; i++) {
            if (arr[i] == testCase) {
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