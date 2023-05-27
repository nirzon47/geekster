import java.util.*;

public class HW_RepeatingMissingElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        int dupe = 0, miss = 0, flagDupe = 0, flagMiss = 0;

        for (int i = 0; i < n; i++) {
            A[i] = i + 1;
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i] == B[j])
                    flagDupe++;
                if (A[i] != B[j])
                    flagMiss++;
            }
            if (flagDupe == 2)
                dupe = A[i];
            if (flagMiss == n) // Meaning there are (number of elements + 1) misses so the element doesn't exist or else it would result n-1
                miss = A[i];
            flagDupe = 0;
            flagMiss = 0;
        }

        System.out.println(dupe);
        System.out.println(miss);

    }
}