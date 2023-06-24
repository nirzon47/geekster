import java.util.*;

public class PrintFrequencyOfAlphabets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] chars = s.toCharArray();

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char aChar : chars) {
            freq.put(aChar, freq.getOrDefault(aChar, 0) + 1);
        }

        HashSet<Character> alreadyPrinted = new HashSet<>();

        for (char ch : chars) {
            if (!alreadyPrinted.contains(ch)) {
                System.out.println(ch + "-" + freq.get(ch));
            }
            alreadyPrinted.add(ch);
        }

    }
}
