import java.util.*;

public class MergeStringsAlternately {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            res.append(s1.charAt(i)).append(s2.charAt(i));
        }

        System.out.println(res);
    }
}