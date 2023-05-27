import java.util.*;

public class HW_PrintAllEvenNumber {

    static void findEven(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int x, y;

        while (T-- > 0) {
            x = sc.nextInt();
            y = sc.nextInt();
            findEven(x, y);
        }

    }
}