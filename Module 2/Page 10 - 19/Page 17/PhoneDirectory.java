import java.util.*;

public class PhoneDirectory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> directory = new HashMap<>();

        while (true) {
            switch (sc.nextInt()) {
                case 1 -> directory.put(sc.next(), sc.next());
                case 2 -> {
                    String word = sc.next();
                    if (directory.containsKey(word)) {
                        System.out.println(directory.get(word));
                    } else {
                        System.out.println(-1);
                    }
                }
                case 3 -> directory.remove(sc.next());
                case 4 -> {
                    return;
                }
            }
        }
    }
}
