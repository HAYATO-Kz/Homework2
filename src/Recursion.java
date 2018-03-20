import java.util.ArrayList;
import java.util.List;

public class Recursion {

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

	public static long fibonacci(int n) {
		if (n < 2)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
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

	}
}
