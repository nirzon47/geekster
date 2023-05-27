import java.util.*;

public class HW_RunningSumAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0, average = 0;

        /*
         sum = (n*(n+1))/2;
         average = sum / n;
        */


        for (int i = 1; i <= n; i++)
            sum += i;
        average = sum / n;

        System.out.println(sum);
        System.out.println(average);
        
    }
}