import java.util.*;

public class PrintZXdivisibleBy3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x % 3 == 0) {
            if (y >= 200)
                z += 10;
            else if (y >= 100)
                z += 5;
            else if (y >= 50)
                z += 4;
            else
                z += 1;
        } else {
            if (y >= 200)
                z += 3;
            else if (y >= 100)
                z += 2;
            else
                z += 1;
        }
        z += 10;
        System.out.println(z);
        
    }
}