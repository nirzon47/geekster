import java.util.*;

public class HW_FinalSalaryGivenAge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int salary = sc.nextInt();

        if (age > 60)
            salary += 1000;
        else if (age > 40)
            salary += 500;
        System.out.println(salary);

    }
}
