package lambdaNew.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import lambdaNew.domain.Apple;
import lambdaNew.functionalInterfaces.Sayable;
import lambdaNew.impl.MethodReference;

class Arithmetic {
	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float adds(int a, int b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}
}

public class MethodReferenceTest {

	public static void main(String[] args) {

		// Referring static method
		Sayable sayable = MethodReference::saySomething;
		// Calling interface method
		sayable.say();

		Thread t2 = new Thread(MethodReference::ThreadStatus);
		t2.start();

		// Arithmetic arithmetic = new Arithmetic();
		BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
		// BiFunction<Integer, Integer, Integer> adder = ( a, b) -> a+b;
		int result = adder.apply(10, 20);
		System.out.println(result);

		BiFunction<Integer, Integer, Integer> adder1 = Arithmetic::add;
		BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
		BiFunction<Float, Float, Float> adder3 = Arithmetic::add;

		BiFunction<Integer, Integer, Float> adder4 = Arithmetic::adds;

		int result1 = adder1.apply(10, 20);
		float result2 = adder2.apply(10, 20.0f);
		float result3 = adder3.apply(10.0f, 20.0f);
		float result4 = adder4.apply(10, 20);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

		List<Apple> apples = Arrays.asList(
				new Apple("Read Rose", 0,"Afganistan"), 
				new Apple("Dark Red", 21, "Australia"),
				new Apple("Blue", 11, "Sri Lanka"), 
				new Apple("Blue", 4,"Sri Lanka"), 
				new Apple("Blue", 19, "Sri Lanka"),
				new Apple("Purple", 2, "New zeland"), 
				new Apple("Read", 1,"Somalia"));

		apples.sort(Comparator.comparing(Apple::getColor).thenComparing(
				Apple::getWeight));

		for (Apple apple : apples) {
			System.out.println(apple);
		}
	}
}
