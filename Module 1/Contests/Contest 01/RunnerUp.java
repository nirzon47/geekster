import java.util.*;

public class RunnerUp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // In 3 numbers the runner-up is not the max or the min between the 3 of them, so we add all three and subtract max and min and get the result
        System.out.println((A + B + C) - Math.max(A, Math.max(B, C)) - Math.min(A, Math.min(B, C)));

    }
}
