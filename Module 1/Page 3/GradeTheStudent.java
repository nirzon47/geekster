import java.util.*;

public class GradeTheStudent {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int mark = sc.nextInt();

        if (mark > 90)
            System.out.println("excellent");
        else if (mark > 80)
            System.out.println("good");
        else if (mark > 70)
            System.out.println("fair");
        else if (mark > 60)
            System.out.println("meets expectations");
        else if (mark > 40)
            System.out.println("below par");
        else
            System.out.println("failed");

    }
}