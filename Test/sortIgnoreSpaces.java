import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.math.RandomUtils;

public class sortIgnoreSpaces {

	public static void sortIgnoringSpaces(String[] array) {
		/*
		 * Please implement this method to
		 * sort a given array of Strings in alphabetical order
		 * ignoring spaces (' ' symbols) within the strings.
		 */

		// List<String> newArray = new ArrayList<String>();
		// for (String ii : array) {
		// if (ii.matches("\\s+")) {
		// continue;
		// } else {
		// newArray.add(ii);
		// }
		// }
		// Collections.sort(newArray);

		// System.out.println(newArray);
		// System.out.println(newArray.size());

		// OTHER WAY

		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		System.out.println("Answer for sort ignoring space:");
		for (String s : array) {
			if (s.matches("\\s+")) {
				continue;
			}
			System.out.println(s);
		}
	}

	public static void main(String args[]) {
		try {
			// sort
			sortIgnoringSpaces(
					new String[] { " ", "test", "ABC", "why", "    ", "HLB", "webiste", "google", "1", "9", "-111" });
			System.out.println("////////////////////////");
			System.out.println();

		} catch (Exception e) {
			System.out.print(e.toString());
		}
	}
}
