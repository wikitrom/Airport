package se.lexicon.application;

import java.util.HashMap;
import java.util.Map;

import se.lexicon.model.foodService.EconomyMenu;
import se.lexicon.model.foodService.Menu;
import se.lexicon.ui.SystemUI;

public class Main {

	public static void main(String[] args) {

		// SystemUI ui = new SystemUI();
		// ui.start();

		Menu eMenu = new EconomyMenu();
		// MenuInterface bMenu = new BusinessMenu();

		Map<String, Integer> meal = new HashMap<>();
		Map<String, Integer> foodItem;

		String wantedFood;
		int totalMealPrice = 0;

		// Economy class example
		wantedFood = "Coffee";

		eMenu.displayMenu();
		foodItem = eMenu.getFoodOrDrink(wantedFood);

		if (!foodItem.isEmpty()) {
			meal.putAll(foodItem);
		}

		foodItem = null;
		wantedFood = "sandwich";
		foodItem = eMenu.getFoodOrDrink(wantedFood);

		if (!foodItem.isEmpty()) {
			meal.putAll(foodItem);
		}

		System.out.println();
		System.out.println("Your selected meal:");
		meal.forEach((k, v) -> System.out.println(k + " (price: " + v + " SEK]"));
		totalMealPrice = meal.entrySet().stream().mapToInt(Map.Entry::getValue).sum();
		System.out.println();
		System.out.println("Total meal price is: " + totalMealPrice);

		// Business class example
		wantedFood = "Coffee";

		eMenu.displayMenu();
		foodItem = eMenu.getFoodOrDrink(wantedFood);

		if (!foodItem.isEmpty()) {
			meal.putAll(foodItem);
		}

		foodItem = null;
		wantedFood = "soup";
		foodItem = eMenu.getFoodOrDrink(wantedFood);

		if (!foodItem.isEmpty()) {
			meal.putAll(foodItem);
		}

		System.out.println();
		System.out.println("Your selected meal:");
		meal.forEach((k, v) -> System.out.println(k + " (price: " + v + " SEK]"));
		totalMealPrice = meal.entrySet().stream().mapToInt(Map.Entry::getValue).sum();
		System.out.println();
		System.out.println("Total meal price is: " + totalMealPrice);

	}
}
