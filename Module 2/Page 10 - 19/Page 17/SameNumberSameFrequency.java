import java.util.*;

public class SameNumberSameFrequency {

    public static void main(String[] args) {
        SortedMap<Integer, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i : map.keySet()) {
            if (map.get(i) == Math.abs(i)) {
                System.out.println(i);
            }
        }
    }
}
