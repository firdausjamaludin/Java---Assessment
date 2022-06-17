import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.math.RandomUtils;

public class reverseArr {

    public static void reverseArray(String[] array) {
        /*
         * Please implement this method to
         * reverse array where the order of elements has been reversed from the original
         * array. E.g. given {"a", "b", "c", "d"}, result is {"d", "c", "b", "a"}
         */

        for (int i = 0; i < array.length / 2; i++) { // why our stop condition is i < array.length/2
                                                     // since we start from left and right of the array simultaneously
                                                     // our stop condition should be in the middle or array.length/2
                                                     // because we already swap all the element by that moment

            String tempVarr = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tempVarr;
        }

        System.out.println("Answer for reverse array:");
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static void main(String args[]) {
        try {

            // reverse
            reverseArray(new String[] { "first", "second", "third", "fourth", "fifth", "sixth", "seventh" });
            System.out.println("////////////////////////");
            System.out.println();

        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }
}
