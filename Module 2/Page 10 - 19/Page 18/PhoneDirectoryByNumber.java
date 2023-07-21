import java.util.*;

public class PhoneDirectoryByNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> directory = new HashMap<>();

        while (true) {
            switch (sc.nextInt()) {
                case 1 -> directory.put(sc.next(), sc.next());
                case 2 -> {
                    String number = sc.next();
                    if (directory.containsKey(number)) {
                        System.out.println(directory.get(number));
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
