import java.util.*;

public class PrintArrayElementsReverseLinewise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i;
        int[] arr = new int[N];

        for (i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        for (i = N - 1; i > -1; i--)
            System.out.print(arr[i] + " ");

    }
}