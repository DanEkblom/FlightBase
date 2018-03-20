package se.lexicon.model;

public class Menu {

	private FoodItem meal;
	private FoodItem beverage;
	
	public Menu(FoodItem meal, FoodItem beverage) {
		this.meal = meal;
		this.beverage = beverage;
	}
	
	public String toString() {
		return "Best�lld meny:\n" + meal.toString() + "\n" + beverage.toString();
	}
	
}
