import java.util.*;

public class CheckIfTwoArraysAreIdentical {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, flag = 0;

        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for (i = 0; i < N; i++)
            arr1[i] = sc.nextInt();

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (i = 0; i < M; i++)
            arr2[i] = sc.nextInt();


        if (N != M)
            System.out.println(false);
        else {
            for (i = 0; i < N; i++) {
                if (arr1[i] != arr2[i]) {
                    flag = 1;
                    break;
                }
            }
            System.out.println(flag != 1);
        }
    }
}