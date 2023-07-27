import java.util.*;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                long t = (long) target - nums[i] - nums[j];

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[left] + nums[right];
                    if (sum == t) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (sum > t) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        List<List<Integer>> res = fourSum(nums, target);

        for (List<Integer> r : res) {
            for (int e : r) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
