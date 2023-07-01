import java.util.*;

public class HW_PlantWatering {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] plants = new int[n];

        for (int i = 0; i < n; i++) {
            plants[i] = sc.nextInt();
        }

        int capacityA = sc.nextInt();
        int capacityB = sc.nextInt();
        
        int aTemp = capacityA, bTemp = capacityB;
        int count = 0, left = 0, right = plants.length - 1;

        while (left <= right) {
            if (left == right) {
                if (capacityA < plants[left] && capacityB < plants[left]) {
                    count++;
                }
                break;
            }

            if (plants[left] > capacityA) {
                count++;
                capacityA = aTemp;
            }
            capacityA -= plants[left];

            if (plants[right] > capacityB) {
                count++;
                capacityB = bTemp;
            }
            capacityB -= plants[right];

            left++;
            right--;

        }

        System.out.println(count);
    }
}
