import java.util.*;

public class OldestAmongThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x > y && x > z)
            System.out.println("A");
        else if (y > z && y > x)
            System.out.println("B");
        else
            System.out.println("C");
        
    }
}
