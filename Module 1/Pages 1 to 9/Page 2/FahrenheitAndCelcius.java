import java.util.*;

public class FahrenheitAndCelcius {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double F = sc.nextDouble();
        double C = (F - 32) * 5.0 / 9.0;

        System.out.println(C);
        
    }
}
