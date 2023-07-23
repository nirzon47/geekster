import java.util.*;

public class CommonElements {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list1.add(sc.next());
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            list2.add(sc.next());
        }

        StringBuilder res = new StringBuilder();
        for (String word : list1) {
            if (list2.contains(word)) {
                res.append(word).append(" ");
            }
        }

        System.out.println(res);

    }
}
