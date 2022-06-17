import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.math.RandomUtils;

public class SumOfNumber {
    public static void getSumOfNumbers(String s) {
        /*
         * Please implement this method to
         * calculate the sum of all integers found in the parameter String. You can
         * assume that
         * integers are separated from other parts with one or more spaces (' ' symbol).
         * For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */

        // Create new array without spaces from string parameter
        String[] newArr = s.split("\\s+", 0); // [text, mix, with, 112, and, 222, with, numbers, 2, 278, 991]
        System.out.println(Arrays.toString(newArr));

        // Create new array with only string number

        // String newArrStringNum[] = {}; // [112, 222, 2, 278, 991]
        // for (String ii : newArr) {
        // if (ii.matches("[0-9]+")) {
        // newArrStringNum = Arrays.copyOf(newArrStringNum, newArrStringNum.length + 1);
        // // copy array to new size
        // newArrStringNum[newArrStringNum.length - 1] = ii; // insert value to the last
        // index of array
        // }
        // }
        // System.out.println(Arrays.toString(newArrStringNum));

        // other method
        // Create new integer arraylist with only number (exclude text)
        int result = 0;
        for (String ii : newArr) {
            if (ii.matches("[0-9]+")) {
                int iiNew = Integer.parseInt(ii); // convert String to Integer
                result = result + iiNew;
            }
        }

        // Convert string to integer from array and then sum of the integer
        // int result = 0;
        // for (int jj : newArrIntNum) {
        // result = result + jj;
        // }
        System.out.println(result);

        System.out.println("Sum of numbers equals to " + result);

    }

    public static void main(String args[]) {
        getSumOfNumbers("text   mix with 112 and 222    with numbers 2 278 991");
    }

}
