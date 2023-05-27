import java.util.*;

public class PrintSeries13_18_23_28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 13; i <= N; i += 5)
            System.out.print(i + " ");

    }
}