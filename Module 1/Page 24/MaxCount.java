import java.util.*;

public class MaxCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int count = 0, maxCount = 0, value = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (maxCount < count) {
                maxCount = count;
                value = arr[i];
            }
            count = 0;
        }
        System.out.println(value);
        
    }
}