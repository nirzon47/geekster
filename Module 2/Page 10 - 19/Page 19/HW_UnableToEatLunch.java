import java.util.*;

public class HW_UnableToEatLunch {
    public static int countStudents(int[] students, int[] sandwiches) {
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

        return students.length - fed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] students = new int[n], sandwiches = new int[n];
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sandwiches[i] = sc.nextInt();
        }

        System.out.println(countStudents(students, sandwiches));
    }
}
