import java.util.*;

public class HW_EvenOrOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String res = x % 2 == 0 ? "Even" : "Odd";

        System.out.println(res);
        
    }
}