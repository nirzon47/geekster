import java.util.*;

public class HW_PrintDumroo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int j = 1, l = m;

        for (int i = 1; i <= m / 2 + 1; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print("\t");
            }
            while (j <= l) {
                System.out.print("*\t");
                j++;
            }
            j = 1;
            l -= 2;
            System.out.println();
        }
        j = 1;
        l = 3;
        for (int i = 1; i <= m / 2; i++) {
            for (int k = m / 2; k > i; k--)
                System.out.print("\t");
            while (j <= l) {
                System.out.print("*\t");
                j++;
            }
            j = 1;
            l += 2;
            System.out.println();
        }
        
    }
}