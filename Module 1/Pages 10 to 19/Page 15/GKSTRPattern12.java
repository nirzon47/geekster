import java.util.*;

public class GKSTRPattern12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int space = n - 1;
        int star = 1;

        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            System.out.println();

            if (i < n) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }
        }
        
    }
}