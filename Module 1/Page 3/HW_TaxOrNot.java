import java.util.*;

public class HW_TaxOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();
        if (salary >= 500000)
            System.out.println("Tax to be paid");
        else
            System.out.println("No tax to be paid");


    }
}
