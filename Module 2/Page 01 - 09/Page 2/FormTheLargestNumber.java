import java.util.*;

public class FormTheLargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] nums = new Integer[n];
        String[] sArray = new String[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            sArray[i] = String.valueOf(nums[i]);
        }

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String temp1 = o1.concat(o2);
                String temp2 = o2.concat(o1);

                return temp2.compareTo(temp1);
            }
        };

        Arrays.sort(sArray, comp);

        for (String s : sArray) System.out.print(s);


    }
}
