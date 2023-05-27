import java.util.*;

public class HW_EvenOdd1000 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            if (n > 1000)
                System.out.println("Even and above 1000");
            else
                System.out.println("Even");
        } else {
            if (n > 1000)
                System.out.println("Odd and above 1000");
            else
                System.out.println("Odd");
        }
        
    }
}