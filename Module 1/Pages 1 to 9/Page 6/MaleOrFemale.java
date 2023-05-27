import java.util.*;

public class MaleOrFemale {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch = sc.nextLine().charAt(0);
        switch (ch) {
            case 'F', 'f' -> System.out.println("You are a female");
            case 'M', 'm' -> System.out.println("You are a male");
            default -> System.out.println("Type again");
        }
        
    }
}