import java.util.*;

public class PrintAlternateElementsLinewise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i;
        int[] arr = new int[N];

        for (i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        for (i = 0; i < N; i += 2)
            System.out.println(arr[i]);

    }
}