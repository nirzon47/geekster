import java.util.*;

public class HW_PrintNto5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (; n >= 5; n--)
            System.out.print(n + " ");

    }
}