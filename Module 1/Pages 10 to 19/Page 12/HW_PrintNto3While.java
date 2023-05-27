import java.util.*;

public class HW_PrintNto3While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n < 3) {
            System.out.println(n);
            n++;
        }

    }
}