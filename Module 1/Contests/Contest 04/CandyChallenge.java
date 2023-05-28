import java.util.*;

public class CandyChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxCandy = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > maxCandy)
                maxCandy = arr[i];
        }

        int extraCandies = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] + extraCandies >= maxCandy)
                System.out.print("true ");
            else
                System.out.print("false ");
        }

    }
}