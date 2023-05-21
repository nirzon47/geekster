import java.util.*;

public class TheBet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int S1 = sc.nextInt();
        int S2 = sc.nextInt();
        int S3 = sc.nextInt();

        int min = Math.min(S1, Math.min(S2, S3));

        if (min == S3) // Meaning Sonu's problem has the least submissions
            System.out.println("Sonu");
        else if (min == S2) // Meaning Bob's problem has the least submissions
            System.out.println("Bob");
        else // Both of them have equal number of submissions
            System.out.println("Draw");

    }
}
