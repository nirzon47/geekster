import java.util.*;

public class PrintSeries3_11_19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 3; i <= N; i += 8)
            System.out.print(i + " ");

    }
}