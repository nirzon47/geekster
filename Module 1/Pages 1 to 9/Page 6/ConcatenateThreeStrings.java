import java.util.*;

public class ConcatenateThreeStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        String s4 = s1 + s2 + s3;

        System.out.println(s4.length());
        System.out.println(s4.charAt(2));
        
    }
}