import java.util.*;

public class ShopDiscount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        int amount = q * 100;

        if (amount > 1000) {
            amount -= (amount * 10.0 / 100);
        }
        System.out.println(amount);
    }
}