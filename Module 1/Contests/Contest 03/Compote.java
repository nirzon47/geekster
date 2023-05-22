
import java.util.*;

public class Compote {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lemon = sc.nextInt();
        int apple = sc.nextInt();
        int pear = sc.nextInt();

        /*
        Commented for explanation:
        Sum of the ratio 1 : 2 : 4,
        int ratioIndex = 1 + 2 + 4;

        Our result is the minimum of lemon, apple / 2, pear / 4 since lemon : apple : pear is 1 : 2 : 4 multiplied by the sum of the ratio.
        int k = Math.min(lemon, Math.min(apple / 2 , pear / 4));

        lemons = ratioIndex * k;
        apples = ratioIndex * k;
        pears = ratioIndex * k;

        int res = lemons + apples + pears;

        */

        int res = 7 * Math.min(lemon, Math.min(apple / 2, pear / 4));
        System.out.println(res);

    }
}