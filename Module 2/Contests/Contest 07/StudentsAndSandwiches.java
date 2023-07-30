import java.util.*;

public class StudentsAndSandwiches {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] students = new int[n];
        int[] sandwiches = new int[n];
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sandwiches[i] = sc.nextInt();
        }

        int[] count = {0, 0};
        int fed = 0;

        for (int student : students) {
            count[student]++;
        }

        for (int sandwich : sandwiches) {
            count[sandwich]--;

            if (count[sandwich] < 0) {
                break;
            } else {
                fed++;
            }
        }

        System.out.println(n - fed);
    }
}
