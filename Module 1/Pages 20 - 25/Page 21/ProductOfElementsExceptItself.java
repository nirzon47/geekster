import java.util.*;

public class ProductOfElementsExceptItself {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Initializing the array
        int[] arr = new int[n];

        // Initializing a product variable to calculate the product of the entire array when we take inputs.
        // Initializing a numZero variable to calculate the number of zeros in the array.
        /* 
            Logic:
            If the number of zeros is 0, the program will just calculate product divided by the current element and just output that.
            If the number of zeros is 1, we increase our numZero counter by 1 and do nothing else. The product skips over the zeros. Always.
            If the number of zeros is more than 1, the output will always be 0 because 0 times anything is zero.
            
        */

        int product = 1, numZero = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0)
                numZero++; // Increments numZero by 1
            else
                product *= arr[i]; // If the element is not zero, calculates the product ignoring the zero.
        }

        for (int i = 0; i < n; i++) {
            if (numZero == 1) { // Checks if the number of zeros is 1 or not. If it is, then checks if the current element is zero.
                if (arr[i] == 0)
                    System.out.println(product); // Prints the product of all elements when zero was ignored.
                else
                    System.out.println(0); // If the current element is not zero, the product of the entire array will be 0.
            } else if (numZero == 0) // If numZero is 0, meaning there are no zeros, the program works without issues.
                System.out.println(product / arr[i]);
            else
                System.out.println(0); // In case numZero is more than 1, that means the entire product of the array will always be 0, no matter                                            what           
        }

    }
}