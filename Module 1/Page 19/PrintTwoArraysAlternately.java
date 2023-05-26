import java.util.*;

public class PrintTwoArraysAlternately {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr1 = new int[N], arr2 = new int[N];

        for (int i = 0; i < N; i++)
            arr1[i] = sc.nextInt();

        for (int i = 0; i < N; i++)
            arr2[i] = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0)
                System.out.print(arr1[i] + " ");
            else
                System.out.print(arr2[i] + " ");
        }
        
    }
}