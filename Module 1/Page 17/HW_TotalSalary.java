import java.util.*;

public class HW_TotalSalary {

    static int HRA(int x) {
        return (int) (x * 20.0 / 100);
    }

    static int DA(int x) {
        return (int) (x * 50.0 / 100);
    }

    static int ALLOW(char ch) {
        if (ch == 'A')
            return 1700;
        else if (ch == 'B')
            return 1500;
        else
            return 1300;
    }

    static int PF(int x) {
        return (int) (x * 11.0 / 100);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);
        int salary = basic + HRA(basic) + DA(basic) + ALLOW(grade) - PF(basic);
        if (basic % 10 != 0)
            salary++;
        System.out.println(salary);

    }
}