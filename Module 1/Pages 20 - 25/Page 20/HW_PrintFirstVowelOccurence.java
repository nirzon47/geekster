import java.util.*;

public class HW_PrintFirstVowelOccurence {

    static boolean isVowel(char ch) {
        char chUpperCase = Character.toUpperCase(ch);
        return chUpperCase == 'A' || chUpperCase == 'E' || chUpperCase == 'I' || chUpperCase == 'O' || chUpperCase == 'U';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[] arr = new char[n];
        int i, flag = 0;

        for (i = 0; i < n; i++)
            arr[i] = sc.next().charAt(0);

        for (i = 0; i < n; i++) {
            if (isVowel(arr[i])) {
                flag = 1;
                break;
            }
        }

        if (flag == 1)
            System.out.println(i);
        else
            System.out.println(-1);

    }
}