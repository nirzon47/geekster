import java.util.*;

public class HW_PerformOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0)
                arr[i] += 1;
            else if (arr[i] < 0)
                arr[i] += 3;
            else
                arr[i] += 2;
        }

        for (int i : arr) System.out.print(i + " ");
        
    }
}