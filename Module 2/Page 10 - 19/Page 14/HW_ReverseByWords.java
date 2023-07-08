import java.util.*;

public class HW_ReverseByWords {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.split(" +");

        for (String word : words) {
            StringBuilder temp = new StringBuilder(word);
            System.out.print(temp.reverse() + " ");
        }
    }
}
