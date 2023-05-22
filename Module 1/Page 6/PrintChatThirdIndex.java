import java.util.*;

public class PrintChatThirdIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if (s.length() >= 4)
            System.out.println(s.charAt(3));
        else
            System.out.println("Small string");
        
    }
}