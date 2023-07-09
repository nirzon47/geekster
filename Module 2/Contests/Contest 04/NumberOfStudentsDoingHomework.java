import java.util.*;

public class NumberOfStudentsDoingHomework {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] startTime = new int[n];
        int[] endTime = new int[n];

        for (int i = 0; i < n; i++) {
            startTime[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            endTime[i] = sc.nextInt();
        }

        int query = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (query >= startTime[i] && query <= endTime[i]) {
                count++;
            }
        }

        System.out.println(count);

    }
}
