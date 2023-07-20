import java.util.*;

public class CharacterFrequency {

    public static void main(String[] args) {
        SortedMap<Character, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }

    }
}
