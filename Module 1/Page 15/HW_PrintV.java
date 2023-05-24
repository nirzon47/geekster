import java.util.*;

public class HW_PrintV {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int k = 1, l = m - 1;

        for (int i = 1; i <= ((m / 2) + 1); i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("\t");
            }
            System.out.print("*");
            while (k <= l) {
                System.out.print("\t");
                k++;
            }
            l -= 2;
            k = 1;
            if (i != ((m / 2) + 1))
                System.out.println("*");
        }
        
    }
}