import java.util.*;

public class ImplementStackUsingArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        while (t-- > 0) {
            switch (sc.next()) {
                case "push" -> list.add(sc.nextInt());
                case "pop" -> {
                    if (!list.isEmpty()) {
                        list.remove(list.size() - 1);
                    }
                }
                case "size" -> System.out.println(list.size());
                case "display" -> {
                    for (int i : list) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
