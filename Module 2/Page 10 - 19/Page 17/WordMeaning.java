import java.util.*;

public class WordMeaning {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> meanings = new HashMap<>();

        while (true) {
            switch (sc.nextInt()) {
                case 1 -> meanings.put(sc.next(), sc.next());
                case 2 -> {
                    String word = sc.next();
                    if (meanings.containsKey(word)) {
                        System.out.println(meanings.get(word));
                    } else {
                        System.out.println(-1);
                    }
                }
                case 3 -> meanings.remove(sc.next());
                case 4 -> {
                    return;
                }
            }
        }
    }
}
