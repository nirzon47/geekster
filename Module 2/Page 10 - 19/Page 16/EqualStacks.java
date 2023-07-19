import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

class Result {

    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts the following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */
    public static int findSum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }

        return sum;
    }

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        int sum1 = findSum(h1), sum2 = findSum(h2), sum3 = findSum(h3);
        int p1 = 0, p2 = 0, p3 = 0;

        while (!(sum1 == sum2 && sum2 == sum3)) {
            if (sum1 >= sum2 && sum1 >= sum3) {
                sum1 -= h1.get(p1);
                p1++;
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                sum2 -= h2.get(p2);
                p2++;
            } else if (sum3 >= sum2 && sum3 >= sum1) {
                sum3 -= h3.get(p3);
                p3++;
            }
        }

        return sum1;

    }

}

public class EqualStacks {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
