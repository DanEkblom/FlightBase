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
		return meal.getPrice() + beverage.getPrice();
	}
	
	public String toString() {
		return "Beställd meny:\n• " + meal.toString() + "\n• " + beverage.toString();
	}
	
}
