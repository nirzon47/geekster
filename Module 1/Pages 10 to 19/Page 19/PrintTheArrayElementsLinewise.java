import java.util.*;

public class PrintTheArrayElementsLinewise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;

        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (i = 0; i < n; i++)
            System.out.println(arr[i]);
        
    }
}