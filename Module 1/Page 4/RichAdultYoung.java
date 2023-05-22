import java.util.*;

public class RichAdultYoung {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int salary = sc.nextInt();

        if (age > 40) {
            if (salary >= 30000)
                System.out.println("You are rich and adult");
            else
                System.out.println("You are an adult");
        } else {
            if (salary >= 12000)
                System.out.println("You are rich and young");
            else
                System.out.println("You are young");
            
        }
    }
}