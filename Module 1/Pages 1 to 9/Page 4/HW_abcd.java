import java.util.*;

public class HW_abcd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int prod = sc.nextInt() * sc.nextInt() * sc.nextInt() * sc.nextInt();

        System.out.println(prod > 1000);
    }
}