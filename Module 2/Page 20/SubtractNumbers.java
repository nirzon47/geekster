import java.util.*;

public class Page10_SubtractNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num > 0) {
                set.add(num);
            }
        }

        System.out.println(set.size());
    }
}
