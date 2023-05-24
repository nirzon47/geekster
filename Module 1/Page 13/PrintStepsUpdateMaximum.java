import java.util.*;

public class PrintStepsUpdateMaximum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int steps = 0, max = -100, num;

        while (n-- > 0) {
            num = sc.nextInt();
            if (num > max) {
                steps++;
                max = num;
            }
        }
        System.out.println(steps);
        
    }
}