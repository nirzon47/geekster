import java.util.*;

public class SolveArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] indexArr = new int[n];
        int[] targetArr = new int[n];
        int i;

        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (i = 0; i < n; i++) {
            indexArr[i] = sc.nextInt();
            targetArr[indexArr[i]] = arr[i];
        }

        for (i = 0; i < n; i++)
            System.out.print(targetArr[i] + " ");
        
    }
}