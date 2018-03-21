import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Hayato Kawai
 *
 */
public class Recursion {

	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * 
	 * @param list
	 *            of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List unique(List list) {
		if (list.size() < 2)
			return list;
		if (list.get(0) == list.get(1)) {
			list.remove(0);
			unique(list);
		} else {
			unique(list.subList(1, list.size()));
		}
		return list;
	}

	public static long oldfibonacci(int n) {
		if (n < 2)
			return 1;
		return oldfibonacci(n - 1) + oldfibonacci(n - 2);
	}

	public static long newfibonacci(int n) {
		return newfibonacci2(n, 1, 0);
	}

	/**
	 * The method that help fibonacci method work faster than normal fibonacci.
	 * 
	 * @param n
	 *            the position of the value.
	 * @param next
	 *            is the next value of fibonacci.
	 * @param start
	 *            is the start value.
	 */
	public static long newfibonacci2(int n, int next, int start) {
		if (n == 0)
			return start;
		if (n == 1)
			return next;
		return newfibonacci2(n - 1, next + start, next);
	}

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("e");
		list = unique(list);
		System.out.println(list);
		// List sub = list.subList(1, 4);
		// sub.get(0);
		// sub.get(1);
		// sub.set(2, "hahaha");
		// sub.remove(1);
		// for(Object o: list) System.out.print(o+", ");

		long startTime1 = System.currentTimeMillis();
		double Recursive1 = oldfibonacci(30);
		long endTime1 = System.currentTimeMillis();
		System.out.println("Recursive1 took: " + (endTime1 - startTime1) + " milliseconds");

		long startTime2 = System.currentTimeMillis();
		double Recursive2 = newfibonacci(17000);
		long endTime2 = System.currentTimeMillis();
		System.out.println("Recursive1 took: " + (endTime2 - startTime2) + " milliseconds");
	}
}
