import java.util.*;

public class MohitRideHailingCompany {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 500)
            System.out.println("premium ride");
        else if (n >= 200)
            System.out.println("average ride");
        else
            System.out.println("regular ride");

    }
}
