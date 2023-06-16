import java.util.*;

public class HW_FormSmallestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        String[] sArray = new String[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            sArray[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(sArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String temp1 = o1.concat(o2);
                String temp2 = o2.concat(o1);

                return temp1.compareTo(temp2);
            }
        });

        for (String s : sArray) System.out.print(s);
    }
}
