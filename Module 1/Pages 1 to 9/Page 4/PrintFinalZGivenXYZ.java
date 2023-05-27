import java.util.*;

public class PrintFinalZGivenXYZ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x >= 20 && z < 100)
            z += 200;
        else if (x >= 10 || y < 50)
            z += 100;

        System.out.println(z);
        
    }
}