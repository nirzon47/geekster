import java.util.*;

public class PrintBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();

        int years = sc.nextInt();

        if (years > 5) {
            int bonus = salary * 5 / 100;
            System.out.println(bonus);
        } else
            System.out.println(0);

    }
}