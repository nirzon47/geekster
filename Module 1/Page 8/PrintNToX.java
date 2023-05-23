import java.util.*;

public class PrintNToX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        for (; n >= x; n--)
            System.out.println(n);
        
    }
}