import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

class Result {
    public static List<Double> runningMedian(List<Integer> list) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>((o1, o2) -> o2 - o1);
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        List<Double> res = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i == 0 || pq1.peek() > list.get(i)) {
                pq1.offer(list.get(i));
            } else {
                pq2.offer(list.get(i));
            }

            int diff = Math.abs(pq1.size() - pq2.size());

            if (diff > 1) {
                if (pq1.size() > pq2.size()) {
                    pq2.offer(pq1.poll());
                } else {
                    pq1.offer(pq2.poll());
                }
            }

            if (pq1.size() == pq2.size()) {
                res.add((double) (pq1.peek() + pq2.peek()) / 2.0);
            } else {
                if (pq1.size() > pq2.size()) {
                    res.add((double) pq1.peek());
                } else {
                    res.add((double) pq2.peek());
                }
            }
        }

        return res;

    }

}

public class FindTheRunningMedian {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = IntStream.range(0, aCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Double> result = Result.runningMedian(a);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
