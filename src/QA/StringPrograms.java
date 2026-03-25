package QA;

import java.util.function.Function;
import java.util.stream.Collectors;

public class StringPrograms {

	public static void main(String[] args) {
		q1(); // Count Frequency of the characters?
		q2(); // Count Occurrence of characters?
	}

	private static void q1() {
		"Hello Rubi raj"
				.toLowerCase()
				.chars()
				.filter(i -> !Character.isSpaceChar(i)) // Filtering blank space
				.mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((k, v) -> System.out.println(k + "=" + v));
	}

	private static void q2() {

		char find = '4';
		long count = "1234455688"
				.chars()
				.mapToObj(i -> (char) i)
				.filter(c -> c.equals(find))
				.count();

		System.out.println("Occurrence of given characters: " + count);

	}

}

