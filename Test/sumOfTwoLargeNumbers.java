import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.math.RandomUtils;

public class sumOfTwoLargeNumbers {

    public static void sumOfTwoLargestNumbers(int[] array) {
        /*
         * Please implement this method to
         * calculate the sum of the two largest numbers in a given array.
         */

        System.out.println(Arrays.toString(array));
        int max1, max2;
        // Find first largest element number in an array and assign it to max1.
        max1 = Arrays.stream(array).max().getAsInt();
        System.out.println(max1);

        // Loop trough the array to find largest element and swap with 0
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max1) {
                array[i] = 0;
                break;
            }
        }
        System.out.println(Arrays.toString(array));

        // Then, find new largest element number in the array and assign to max2
        max2 = Arrays.stream(array).max().getAsInt();
        System.out.println(max2);

        // Sum the max1 and max2 largest variable
        int result = max1 + max2;

        System.out.println("Sum of the two largest numbers is " + result);
    }

    public static void main(String args[]) {
        try {

            // sum two largest
            int[] array = { 43, 12, 12, 44, 47, 9, 34, 58, 3, 11, 4, 21 };
            sumOfTwoLargestNumbers(array);
            System.out.println("////////////////////////");
            System.out.println();

        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }
}
