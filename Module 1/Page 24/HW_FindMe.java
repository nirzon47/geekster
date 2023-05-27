import java.util.*;

public class HW_FindMe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] N = new int[n];
        for (int i = 0; i < n; i++)
            N[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] M = new int[m];
        for (int i = 0; i < m; i++)
            M[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (Math.abs(N[i]) == M[j]) {
                    System.out.print(N[i] + " ");
                    break;
                }
            }
        }

    }
}