import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.math.RandomUtils;

public class Test {
	public static void getSumOfNumbers(String s) {

		/*
		 * Please implement this method to
		 * calculate the sum of all integers found in the parameter String. You can
		 * assume that
		 * integers are separated from other parts with one or more spaces (' ' symbol).
		 * For example, s="12 some text 3  7", result: 22 (12+3+7=22)
		 */

		// Create new array without spaces from string arguments
		String[] newArr = s.split("\\s+", 0); // [text, mix, with, 112, and, 222, with, numbers, 2, 278, 991]

		// Create new array with only string number
		ArrayList<String> newArrStringNum = new ArrayList<String>(); // [112, 222, 2, 278, 991]
		for (String ii : newArr) {
			if (ii.matches("[0-9]+")) {
				newArrStringNum.add(ii);
			}
		}
		System.out.println(newArrStringNum);

		// Convert string to integer from array and then sum of the integer
		int result = 0;
		for (String jj : newArrStringNum) {
			result = result + Integer.parseInt(jj);
		}

		System.out.println("Sum of numbers equals to " + result);
	}

	public static void sortIgnoringSpaces(String[] array) {
		/*
		 * Please implement this method to
		 * sort a given array of Strings in alphabetical order
		 * ignoring spaces (' ' symbols) within the strings.
		 */
		System.out.println("Answer for sort ignoring space:");
		for (String s : array) {
			System.out.println(s);
		}
	}

	public static void reverseArray(String[] array) {
		/*
		 * Please implement this method to
		 * reverse array where the order of elements has been reversed from the original
		 * array. E.g. given {"a", "b", "c", "d"}, result is {"d", "c", "b", "a"}
		 */

		System.out.println("Answer for reverse array:");
		for (String s : array) {
			System.out.println(s);
		}
	}

	public static void sumOfTwoLargestNumbers(int[] array) {
		/*
		 * Please implement this method to
		 * calculate the sum of the two largest numbers in a given array.
		 */

		System.out.println("Sum of the two largest numbers is ");
	}

	// Please do not change this helper class
	public static class Node {
		int val;
		List<Node> children;

		int getValue() {
			return val;
		}

		void setValue(int val) {
			this.val = val;
		}

		List<Node> getChildren() {
			return children;
		}

		void setChildren(List<Node> children) {
			this.children = children;
		}
	}

	public static void getAverage(Node root) {
		/*
		 * Please implement this method to
		 * calculate the average of all node values (Node.getValue()) in the tree.
		 * root
		 * c1 c2
		 * c3
		 * c4 c5 c6
		 * 
		 * The codes must able to support any tree structures even the orphan root which
		 * doesn't have children.
		 * You can create any helper function as needed.
		 */

		System.out.println("Average of the node values equals to ");
	}

	public static void main(String args[]) {
		try {
			// sum
			getSumOfNumbers("text   mix with 112 and 222    with numbers 2 278 991");
			System.out.println("////////////////////////");
			System.out.println();

			// sort
			sortIgnoringSpaces(
					new String[] { " ", "test", "ABC", "why", "    ", "HLB", "webiste", "google", "1", "9", "-111" });
			System.out.println("////////////////////////");
			System.out.println();

			// reverse
			reverseArray(new String[] { "first", "second", "third", "fourth", "fifth", "sixth", "seventh" });
			System.out.println("////////////////////////");
			System.out.println();

			// sum two largest
			int[] array = { 43, 12, 12, 44, 47, 9, 34, 58, 3, 11, 4, 21 };
			sumOfTwoLargestNumbers(array);
			System.out.println("////////////////////////");
			System.out.println();

			// average
			Node root = new Node();
			root.setValue(RandomUtils.nextInt(100));
			Node c1 = new Node();
			c1.setValue(RandomUtils.nextInt(100));
			Node c2 = new Node();
			c2.setValue(RandomUtils.nextInt(100));
			List<Node> list = new ArrayList<>();
			list.add(c1);
			list.add(c2);
			root.setChildren(list);

			Node c3 = new Node();
			c3.setValue(RandomUtils.nextInt(100));
			list = new ArrayList<>();
			list.add(c3);

			c2.setChildren(list);

			Node c4 = new Node();
			c4.setValue(RandomUtils.nextInt(100));
			Node c5 = new Node();
			c5.setValue(RandomUtils.nextInt(100));
			Node c6 = new Node();
			c6.setValue(RandomUtils.nextInt(100));
			list = new ArrayList<>();
			list.add(c4);
			list.add(c5);
			list.add(c6);
			c3.setChildren(list);

			getAverage(root);

			int total = root.getValue() + c1.getValue() + c2.getValue() + c3.getValue() + c4.getValue() + c5.getValue()
					+ c6.getValue();
			double ans = (double) total / 7;
			System.out.println("Correct answer: " + total + " / 7 = " + ans);
		} catch (Exception e) {
			System.out.print(e.toString());
		}
	}
}
