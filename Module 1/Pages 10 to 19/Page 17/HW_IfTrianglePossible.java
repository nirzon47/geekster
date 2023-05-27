import java.util.*;

public class HW_IfTrianglePossible {

    static boolean checkTriangle(int x, int y, int z) {
        return x + y > z && y + z > x && x + z > y;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(checkTriangle(A, B, C));
        
    }
}