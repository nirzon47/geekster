import java.util.*;

public class HW_ElementInMinority {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE, currentCount = 0, minimumCount = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    currentCount++;
            }
            if (minimumCount >= currentCount) {
                minimumCount = currentCount;
                min = arr[i];
            }
            currentCount = 0;
        }


        System.out.println(min);

    }
}