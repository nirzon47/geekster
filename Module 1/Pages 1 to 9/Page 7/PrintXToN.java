import java.util.*;

public class PrintXToN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        for (; x <= n; x++)
            System.out.println(x);
        
    }
}