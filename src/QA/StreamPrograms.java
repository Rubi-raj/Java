package QA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPrograms {

	public static void main(String[] args) {

		// 1. Java program to count the occurrence of each character in a string e.g:- "ilovejavatechie"
		question1();

		// 2. Java program to find all duplicate element from a given string
		question2();

		// 3. Java program to find first non-repeat element from a given string
		question3();

		// 4. Java program to find second highest number from given array e.g:- {5,9,11, 2,8,21,1};
		question4();

		// 5. Java program to find longest string from given array e.g:- {"java", "C", "Rubi", "springboot", "microservices"};
		question5();

		// 6. Java program to find all elements from array who starts with 1 e.g:- {5,9,11,2,8,21,1};
		question6();

		// 7. String.join() method
		question7();

		// 8. skip and limit example
		question8();
	}

	private static void question1() {
		print(Arrays.stream("ilovejavatechie".split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
	}

	private static void question2() {

		// duplicate elements
		print(Arrays.stream("ilovejavatechie".split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(v -> v.getValue() > 1)
				.map(Map.Entry::getKey).collect(Collectors.toList())
		);

		// unique elements
		print(Arrays.stream("ilovejavatechie".split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(v -> v.getValue() == 1)
				.map(Map.Entry::getKey).collect(Collectors.toList())

		);
	}

	// 3. Java program to find first non-repeat element from a given string
	private static void question3() {

		String nonRepeat = Arrays.stream("ilovejavatechie".split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(v -> v.getValue() == 1).findFirst().get().getKey();

		String repeat = Arrays.stream("ilovejavatechie".split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(v -> v.getValue() > 1).findFirst().get().getKey();

		print("First non-repeat element :: " + nonRepeat);
		print("First repeat element :: " + repeat);
	}

	// 4. Java program to find second highest number from given array e.g:- {5,9,11, 2,8,21,1};
	private static void question4() {

		int[] numbers = {5, 9, 11, 2, 8, 21, 1};

		// Second highest number
		print(Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
	}

	// 5. Java program to find longest string from given array e.g:- {"java", "C", "Rubi", "springboot", "microservices"};
	private static void question5() {

		String[] names = {"java", "C", "Rubi", "springboot", "microservices"};

		print(Arrays.stream(names).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get());
	}

	// 6. Java program to find all elements from array who starts with 1 e.g:- {5,9,11,2,8,21,1};
	private static void question6() {

		int[] numbers = {5, 9, 11, 2, 8, 21, 1};

		print(Arrays.stream(numbers).boxed().map(Object::toString).filter(s -> s.startsWith("1")).collect(Collectors.toList()));
	}

	private static void question7() {

		String[] nos = {"1", "2", "3", "4", "5"};

		print(String.join("-", nos));
	}

	private static void question8() {

		// print range of (2,9) from 1...10
		IntStream.range(1, 10).skip(1).limit(8).forEach(System.out::print);
	}


	private static void print(Object object) {
		System.out.println(object);
	}
}
