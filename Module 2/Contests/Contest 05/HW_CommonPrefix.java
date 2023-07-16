import java.util.*;

public class HW_CommonPrefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] sArr = new String[n];
        for (int i = 0; i < n; i++) {
            sArr[i] = sc.next();
        }

        if (sArr.length == 0) {
            System.out.println();
            return;
        }
        if (sArr.length == 1) {
            System.out.println(sArr[0]);
            return;
        }

        StringBuilder prefix = new StringBuilder();
        int i = 0;
        int limit = Math.min(sArr[0].length(), sArr[1].length());

        while (i < limit && sArr[0].charAt(i) == sArr[1].charAt(i)) {
            prefix.append(sArr[0].charAt(i));
            i++;
        }

        for (int j = 2; j < n; j++) {
            while (!prefix.isEmpty()) {
                if (!sArr[j].contains(prefix.toString())) {
                    prefix.deleteCharAt(prefix.length() - 1);
                } else {
                    break;
                }
            }
            if (prefix.isEmpty()) {
                System.out.println();
                return;
            }
        }

        System.out.println(prefix);
    }
}
