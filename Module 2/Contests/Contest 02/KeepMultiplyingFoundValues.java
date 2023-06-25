import java.util.*;

public class KeepMultiplyingFoundValues {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            hs.add(nums[i]);
        }

        int original = sc.nextInt();

        while (hs.contains(original)) {
            original *= 2;
        }

        System.out.println(original);

    }
}