import java.util.*;

public class HW_FurthestBuildingYouCanReach {
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        int n = heights.length - 1;

        for (int i = 0; i < n; i++) {
            if (heights[i] >= heights[i + 1]) {
                continue;
            }

            int diff = heights[i + 1] - heights[i];
            bricks -= diff;
            heap.offer(diff);

            if (bricks < 0) {
                bricks += heap.poll();
                if (ladders > 0) {
                    ladders--;
                } else {
                    return i;
                }
            }
        }

        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        int bricks = sc.nextInt();
        int ladders = sc.nextInt();

        System.out.println(furthestBuilding(heights, bricks, ladders));
    }
}
