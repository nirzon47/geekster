import java.util.*;

public class HW_KavinTT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int countZero = 0, countOne = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                countZero++;
            } else {
                countOne++;
            }
        }

        if (countZero > countOne) {
            System.out.println("LOSE");
        } else {
            System.out.println("WIN");
        }
    }
}
