import java.util.*;

public class GKSTRCountEven {

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (isEven(arr[i]))
                count++;
        }

        System.out.println(count);
    }
}