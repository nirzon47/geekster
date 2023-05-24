import java.util.*;

public class Print5toNWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 5;
        while (i <= n) {
            System.out.println(i);
            i++;
        }

    }
}