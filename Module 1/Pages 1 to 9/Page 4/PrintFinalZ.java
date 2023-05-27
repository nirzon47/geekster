import java.util.*;

public class PrintFinalZ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x >= 20) {
            if (y >= 100)
                z += 100;
            else if (y >= 50)
                z += 50;
            else
                z += 10;
        } else {
            if (y >= 100)
                z += 3;
            else if (y >= 50)
                z += 2;
            else
                z += 1;
        }
        System.out.println(z);
    }
}