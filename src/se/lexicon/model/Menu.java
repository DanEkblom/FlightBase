package se.lexicon.model;

public class Menu {

	private FoodItem meal;
	private FoodItem beverage;
	
	public Menu(FoodItem meal, FoodItem beverage) {
		this.meal = meal;
		this.beverage = beverage;
	}
	
	//TODO
	/*
	 * Returns the cost of current meal and beverage 
	 */
	public int totalFoodCost(Menu menu) {
		// h�mta priset f�r meal och beverage; returnera summan
		return 34;
	}
	
	public String toString() {
		return "Best�lld meny:\n� " + meal.toString() + "\n� " + beverage.toString();
	}
	
}
