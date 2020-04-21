package streams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import streams.domain.Dish;

public class StreamDishTest {
	public static void main(String[] args) {

		List<Dish> menu = Arrays.asList(
				new Dish("pork", false, 800,Dish.Type.MEAT), 
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT), 
				new Dish("french fries", true, 530, Dish.Type.OTHER), 
				new Dish("rice", true, 350, Dish.Type.OTHER), 
				new Dish("season fruit", true, 120, Dish.Type.OTHER), 
				new Dish("pizza", true, 550, Dish.Type.OTHER), 
				new Dish("prawns", false, 300, Dish.Type.FISH), 
				new Dish("salmon", false, 450, Dish.Type.FISH));

		List<String> list = menu.stream().filter(t -> t.getCalories() > 500)
				.map(t -> t.getName()).limit(3).collect(Collectors.toList());
		
		System.out.println(list);
		
		// average calories of all dishes where calorie is greater than 500
		Double list2 = menu.stream().filter(t -> { System.out.println("Calling filter(t -> "); return t.getCalories() > 500;})
				.collect(Collectors.averagingInt((Dish t) ->  { System.out.println("(Dish t) -> " + t.getCalories()); return t.getCalories();}));
		
		System.out.println(list2);
	}
}
