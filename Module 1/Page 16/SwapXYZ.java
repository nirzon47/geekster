import java.util.*;

public class SwapXYZ {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int temp1 = x;
        int temp2 = y;
        x = z;
        y = temp1;
        z = temp2;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}