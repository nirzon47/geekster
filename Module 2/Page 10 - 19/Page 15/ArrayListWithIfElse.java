import java.util.*;

public class ArrayListWithIfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int T = sc.nextInt();

        while (T-- > 0) {
            int check = sc.nextInt();
            switch (check) {
                case 1 -> System.out.println(list.size());
                case 2 -> {
                    if (list.size() == 0) {
                        System.out.println("invalid-move");
                    } else {
                        System.out.println(list.get(list.size() - 1));
                        list.remove(list.size() - 1);
                    }
                }
                case 3 -> {
                    list.add(sc.nextInt());
                    System.out.println(list.get(list.size() - 1));
                }
                case 4 -> {
                    if (list.size() == 0) {
                        System.out.println("invalid-move");
                    } else {
                        System.out.println(list.get(0));
                        list.remove(0);
                    }
                }
                case 5 -> {
                    list.add(0, sc.nextInt());
                    System.out.println(list.get(0));
                }
                case 6 -> {
                    if (list.size() == 0) {
                        System.out.println("invalid-move");
                    } else {
                        for (int i : list) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                }
                default -> System.out.println("invalid-move");
            }
        }
    }
}
