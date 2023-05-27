import java.util.*;

public class HW_GraceMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if (marks < 33)
            marks += 4;

        System.out.println(marks);

    }
}